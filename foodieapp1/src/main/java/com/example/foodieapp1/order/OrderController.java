package com.example.foodieapp1.order;

import com.example.foodieapp1.common.Message;
import com.example.foodieapp1.item.Item;
import com.example.foodieapp1.item.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {
    private ItemRepository itemRepository;
    private ClientOrder clientOrder;
    private OrderRepository orderRepository;

    public OrderController(ItemRepository itemRepository, ClientOrder clientOrder, OrderRepository orderRepository) {
        this.itemRepository = itemRepository;
        this.clientOrder = clientOrder;
        this.orderRepository = orderRepository;
    }

    @GetMapping("/zamowienie/dodaj")
    public String addItemToOrder(@RequestParam Long item, Model model) {
        Optional<Item> byId = itemRepository.findById(item);
        byId.ifPresent(clientOrder::add);
        if (byId.isPresent()) {
            model.addAttribute("message", new Message("Dodano", "Do zamówienia dodano: " + byId.get().getName()));
        } else {
            model.addAttribute("message", new Message("Nie dodano", "Podano błędne ID z menu: " + item));
        }
        return "message";
    }

    @GetMapping("/zamowienie")
    public String getCurrentOrder(Model model) {
        model.addAttribute("order", clientOrder.getOrder());
        model.addAttribute("sum", clientOrder.getOrder()
                .getItems().stream().mapToDouble(Item::getPrice).sum());
        return "order";
    }

    @PostMapping("/zamowienie/realizuj")
    public String proceedOrder(
            @RequestParam String address,
            @RequestParam String telephone,
            Model model) {
        Order order = clientOrder.getOrder();
        order.setAddress(address);
        order.setTelephone(telephone);
        orderRepository.save(order);
        clientOrder.clear();
        model.addAttribute("message", new Message("Dziękujemy", "Zamowienie przekazane do realizacji"));
        return "message";
    }

    @GetMapping("/panel/zamowienia")
    public String provideSpecificStatus(
            @RequestParam(required = false) OrderStatus status,
            Model model) {
            List<Order> orders = null;
        if (status == null) {
            orders = orderRepository.findAll();
        } else {
            Optional<List<Order>> optionalOrderList = orderRepository.findAllByStatus(status);
            if (optionalOrderList.isPresent())
                orders = optionalOrderList.get();
            else
                System.err.println("Nie udało się zebrać zasobu");
        }
        model.addAttribute("orders", orders);
        return "OrderList";
    }

    @GetMapping("/panel/zamowienia/details")
    public String orderDetail(
            @RequestParam Long order,
            Model model
    ){
        Optional<Order> optionalOrder = orderRepository.findById(order);
        return optionalOrder.map(order1 -> fillContent(order1, model)).orElse("redirect:/");
    }

    private String fillContent(Order order, Model model) {
        model.addAttribute("order", order);
        model.addAttribute("sum", order.getItems().stream().mapToDouble(Item::getPrice).sum());
        return "orderDetail";

    }

    @PostMapping("/panel/zamowienie/{id}/realizuj")
    public String changeOrderstatus(@PathVariable Long id, Model model){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        optionalOrder.ifPresent( order -> {
            order.setStatus(order.getStatus().next());
            orderRepository.save(order);
        });
        return optionalOrder.map(order -> fillContent(order, model)).orElse("redirect:/");
    }
}


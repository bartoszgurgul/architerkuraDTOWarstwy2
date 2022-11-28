package com.example.foodieapp1;

import com.example.foodieapp1.item.Item;
import com.example.foodieapp1.item.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private ItemRepository itemRepository;

    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        List<Item> all = itemRepository.findAll();
        model.addAttribute("items", all);
        return "index";
    }


}

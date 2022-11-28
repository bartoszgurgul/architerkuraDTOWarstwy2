package com.example.foodieapp1.item;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ItemController {
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/danie/{name}")
    public String dishDetails(@PathVariable String name, Model model){
        Optional<Item> byUrl = itemRepository.findByNameIgnoreCase(name.replace("-"," "));
        byUrl.ifPresentOrElse(item -> model.addAttribute("item", item), () -> System.err.println("url jest zly :C:C:C:C:"));
        return byUrl.map(it -> "item").orElse("redirect:/");
    }
}

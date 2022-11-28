package com.example.objectform.controller;

import com.example.objectform.model.Promotion;
import com.example.objectform.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PromotionController {
    private final PromotionRepository promotionRepository;

    @Autowired
    public PromotionController(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }
    @GetMapping("/")
    public String promotionList(Model model){
        model.addAttribute("promotions", promotionRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("promotion", new Promotion());
        return "add-form";
    }

    @PostMapping("/save")
    public String savePromotion(Promotion promotion){
        promotionRepository.add(promotion);
        return "redirect:/";
    }
}

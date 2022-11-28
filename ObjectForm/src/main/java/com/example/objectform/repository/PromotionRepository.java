package com.example.objectform.repository;

import com.example.objectform.model.Promotion;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@Repository
public class PromotionRepository {
    private final List<Promotion> promotionList = new LinkedList<>();

    public void add(Promotion promotion){
        promotionList.add(0,promotion);
    }

    public List<Promotion> findAll(){
        return promotionList;
    }

}

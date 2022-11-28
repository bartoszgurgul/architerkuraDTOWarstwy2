package com.example.foodieapp1.order;

import java.util.Arrays;
import java.util.Optional;

public enum OrderStatus {
    NEW("Nowe", 1),
    IN_PROGRESS("W trakcie", 2),
    COMPLETE("Zrealizowane", 3);
    private String plContent;
    private int id;

    OrderStatus(String plContent, int id) {
        this.plContent = plContent;
        this.id = id;
    }

    OrderStatus(String plContent) {
        this.plContent = plContent;
    }

    public String getPlContent() {
        return plContent;
    }

    public int getId() {
        return id;
    }

    public OrderStatus next() {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getId() == this.getId()+1)
                return value;
        }
        return this;
    }
}

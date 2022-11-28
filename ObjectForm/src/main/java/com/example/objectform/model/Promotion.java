package com.example.objectform.model;

import java.math.BigDecimal;

public class Promotion {
    private String product;
    private String shop;
    private BigDecimal price;
    private BigDecimal discountPrice;

    public String getProduct() {
        return product;
    }

    public Promotion setProduct(String product) {
        this.product = product;
        return this;
    }

    public String getShop() {
        return shop;
    }

    public Promotion setShop(String shop) {
        this.shop = shop;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Promotion setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public Promotion setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }
}

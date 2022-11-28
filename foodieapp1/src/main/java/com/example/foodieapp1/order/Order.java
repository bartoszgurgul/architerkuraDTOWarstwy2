package com.example.foodieapp1.order;

import com.example.foodieapp1.item.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable
            (name = "order_item",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private List<Item> items = new ArrayList<>();
    private String address;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;



    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Order setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Order setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Order setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Order setStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
        return this;
    }
}

package com.agency04.sbss.pizza.dto;

import com.agency04.sbss.pizza.model.Size;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn
    @ManyToOne
    private Pizza pizza;

    @Column
    private String quantity;

    @Column
    @Enumerated
    private Size size;

    @JoinColumn
    @ManyToOne
    private Delivery delivery;

    public PizzaOrder(){}

    public PizzaOrder(Pizza pizza, String quantity, Size size, Delivery delivery){
        this.pizza = pizza;
        this.quantity = quantity;
        this.size = size;
        this.delivery = delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Size getSize() {
        return size;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return Objects.equals(id, that.id) && Objects.equals(pizza, that.pizza) && Objects.equals(quantity, that.quantity) && size == that.size && Objects.equals(delivery, that.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pizza, quantity, size, delivery);
    }
}

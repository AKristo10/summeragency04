package com.agency04.sbss.pizza.controller.delivery;

import com.agency04.sbss.pizza.model.Customer;

public class DeliveryOrderForm {

    private Customer customer;
    private String nameOfPizza;
    private int quantity;

    public DeliveryOrderForm(){}

    public DeliveryOrderForm( Customer customer, String nameOfPizza, int quantity){
        this.quantity = quantity;
        this.nameOfPizza = nameOfPizza;
        this.customer = customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }
}


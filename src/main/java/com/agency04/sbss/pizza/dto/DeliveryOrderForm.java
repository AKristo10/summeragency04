package com.agency04.sbss.pizza.dto;

/**
 * The class represents delivery order form
 *
 * @author Andrea
 */
public class DeliveryOrderForm {

    private String customerUsername;
    private String nameOfPizza;
    private int quantity;

    /**
     * Empty constructor
     */
    public DeliveryOrderForm(){}

    /**
     * Constructor that set value of customerUsername, nameOfPizza and quantity
     * @param customerUsername customer's username
     * @param nameOfPizza name of pizza
     * @param quantity quantity of pizzas
     */
    public DeliveryOrderForm( String customerUsername, String nameOfPizza, int quantity){
        this.quantity = quantity;
        this.nameOfPizza = nameOfPizza;
        this.customerUsername = customerUsername;
    }

    /**
     * Set the value of customer's username
     * @param customerUsername value of customer's username
     */
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    /**
     * Set the name of pizza
     * @param nameOfPizza name of pizza
     */
    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }

    /**
     * Set the quantity of pizzas
     * @param quantity quantity of pizzas
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Method that returns customer's username
     * @return  customer's username
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * Method that return value od quantity
     * @return  value od quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Method return name of pizza
     * @return name of pizza
     */
    public String getNameOfPizza() {
        return nameOfPizza;
    }
}


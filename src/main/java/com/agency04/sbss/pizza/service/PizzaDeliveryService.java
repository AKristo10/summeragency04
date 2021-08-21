package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.dto.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents Pizza Delivery Service
 * @author Andrea
 */
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;
    private List<DeliveryOrderForm> orders = new ArrayList<>();

    /**
     * Method add the order to list
     * @param order order in list
     * @return just added order
     */
    public DeliveryOrderForm addOrder(DeliveryOrderForm order){
        boolean customerExists = false;
        for(DeliveryOrderForm o : this.orders){
            if(order.getCustomerUsername().equals(order.getCustomerUsername()))
                customerExists = true;
        }
        if(!customerExists){
            throw new CustomerNotFoundException("Customer " + order.getCustomerUsername() + " does not exist.");
        }
        orders.add(order);
        return order;
    }

    /**
     * Method returns list of orders
     * @return list of orders
     */
    public List<DeliveryOrderForm> getOrders() {
        return orders;
    }

    /**
     * Set the value of pizzeria service
     * @param thepizzeriaService
     */
    @Autowired
    @Qualifier("bestPizzaPizzeriaService")
    public void setPizzeriaService(PizzeriaService thepizzeriaService) {
        this.pizzeriaService = thepizzeriaService;
    }

    /**
     * Method that returns current pizzeria service.
     * @return current pizzeria service.
     */
    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    /**
     * Method for ordering pizza.
     * @param pizza sort of pizza for order
     * @return
     */
    public String orderPizza(Pizza pizza){
       return pizza.getName()  + " is in your order. Yummy :). Ingredients: " + pizza.getIngredients().toString() + " ";
    }

    public String getInfo(){
        return "The current pizzeria service is " + this.pizzeriaService.getName()
                + ". Address of " + pizzeriaService.getName()
                + " is " + pizzeriaService.getAddress();
    }
}

package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.dto.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.*;
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
    @Autowired
    private CustomerService customerService;

    /**
     * Method add the order to list
     * @param order order in list
     * @throws CustomerNotFoundException if customer does not exist
     * @return just added order
     */
    public DeliveryOrderForm addOrder(DeliveryOrderForm order){
        if(customerService.getCustomers().size() == 0){
            throw new CustomerNotFoundException("Customer " + order.getCustomerUsername() + " does not exist!");
        }

        customerService.getCustomers().stream().forEach(customer -> {
            if(!customer.getUsername().equals(order.getCustomerUsername())) {
                throw new CustomerNotFoundException("Customer " + order.getCustomerUsername() + " does not exist!");
            }
            else {
                orders.add(order);
            }

        });
        return  order;

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

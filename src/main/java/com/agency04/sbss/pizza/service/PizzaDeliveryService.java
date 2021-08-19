package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Represents Pizza Delivery Service
 * @author Andrea
 */
public class PizzaDeliveryService {

    public PizzeriaService pizzeriaService;

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
}

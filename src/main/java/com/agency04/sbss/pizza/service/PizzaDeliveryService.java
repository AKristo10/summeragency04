package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Represents Pizza Delivery Service
 *
 * @author Andrea
 */
public class PizzaDeliveryService {

    public PizzeriaService pizzeriaService;

    /**
     * Set the value of pizzeria service
     *
     * @param thepizzeriaService
     */
    @Autowired
    @Qualifier("bestPizzaPizzeriaService")
    public void setPizzeriaService(PizzeriaService thepizzeriaService) {
        this.pizzeriaService = thepizzeriaService;
    }


    /**
     * Method for ordering pizza.
     *
     * @param pizza sort of pizza for order
     * @return
     */
    public String orderPizza(Pizza pizza) {
        System.out.println("Ahoyyyyy andy ovo je " + pizzeriaService.getName());
        return pizza.getName() + " is in your order. Yummy :). Ingredients: " + pizza.getIngredients().toString() + " ";
    }
}

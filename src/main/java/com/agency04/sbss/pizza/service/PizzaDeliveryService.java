package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Represents Pizza Delivery Service
 * @author Andrea
 */
@Component
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    /**
     * Set the value of pizzeria service
     * @param thepizzeriaService
     */
    @Autowired
    @Qualifier("italianaPizzeriaService")
    public void setPizzeriaService(PizzeriaService thepizzeriaService) {
        this.pizzeriaService = thepizzeriaService;
    }


    /**
     * Method for ordering pizza.
     * @param pizza sort of pizza for order
     * @return
     */
    public String orderPizza(Pizza pizza){
       return this.pizzeriaService.getName() + " is making pizza. Yummy :)";
    }
}

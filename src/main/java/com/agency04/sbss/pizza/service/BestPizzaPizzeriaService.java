package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Class represents BestPizza Pizzeria Service.
 */
@Component
public class BestPizzaPizzeriaService implements PizzeriaService {

    @Value("Best Pizza")
    private String namePizzeria;

    @Value("Unska 3")
    private String address;

    @Override
    public void setName(String namePizzeria) {
        this.namePizzeria = namePizzeria;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getName() {
        return this.namePizzeria;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return  "Making pizza";
    }
}

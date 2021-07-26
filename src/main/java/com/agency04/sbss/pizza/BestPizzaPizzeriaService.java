package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;

/**
 * Class represents BestPizza Pizzeria Service.
 */
public class BestPizzaPizzeriaService implements  PizzeriaService{

    @Value("BestPizza")
    private String name;

    @Value("Unska 3")
    private String address;


    @Override
    public String getName() {
        return this.name;
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

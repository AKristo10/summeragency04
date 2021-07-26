package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;

/**
 * Class represents Italiana Pizzeria Service.
 */
public class ItalianaPizzeriaService implements  PizzeriaService{

    @Value("${name.pizzeria}")
    private String name;

    @Value("${address.pizzeria}")
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
        return "Making pizza";
    }
}

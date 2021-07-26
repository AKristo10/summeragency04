package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;

/**
 * Class represents Italiana Pizzeria Service.
 */
public class ItalianaPizzeriaService implements  PizzeriaService{


    private String namePizzeria;
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
        return "Making pizza";
    }
}

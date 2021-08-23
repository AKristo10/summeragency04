package com.agency04.sbss.pizza.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.List;

/**
 * Class represents BestPizza Pizzeria Service.
 */

public class BestPizzaPizzeriaService implements PizzeriaService {

    @Value("Best Pizza")
    private String namePizzeria;

    @Value("Unska 3")
    private String address;

    @Autowired
    MarinaraPizza marinaraPizza;

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

    @Override
    public List<Pizza> getMenu() {
        List<Pizza> menu = new ArrayList<>();
        menu.add(marinaraPizza);
        return menu;
    }
}

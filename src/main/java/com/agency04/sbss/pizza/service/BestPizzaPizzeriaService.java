package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.dto.Pizza;
import com.agency04.sbss.pizza.model.PizzaIngredient;
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
        Pizza carbonara = new Pizza();
        carbonara.setName("carbonara");
        carbonara.setIngredients(List.of(
                PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.BACON
        ));
        menu.add(carbonara);
        return menu;
    }
}

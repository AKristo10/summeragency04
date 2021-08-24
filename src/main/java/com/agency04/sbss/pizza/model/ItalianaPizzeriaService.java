package com.agency04.sbss.pizza.model;

import com.agency04.sbss.pizza.dto.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents Italiana Pizzeria Service.
 */
@Component
public class ItalianaPizzeriaService implements PizzeriaService {

    @Value("${name.pizzeria}")
    private String namePizzeria;

    @Value("${address.pizzeria}")
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


    public String makePizza(Pizza pizza) {
        return "Making pizza";
    }

    @Override
    public List<Pizza> getMenu() {
        List<Pizza> menu = new ArrayList<>();
        Pizza marinara = new Pizza();
        marinara.setName("marinara");
        marinara.setIngredients(List.of(
                PizzaIngredient.TOMATO_SAUCE, PizzaIngredient.BACON, PizzaIngredient.EGG
        ));
        menu.add(marinara);
        return menu;
    }

}

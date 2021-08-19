package com.agency04.sbss.pizza.model;

import com.agency04.sbss.pizza.PizzaConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);
        List<Pizza> menu = new ArrayList<Pizza>();
        menu.add(context.getBean("marinaraPizza", Pizza.class));
        return menu;
    }
}

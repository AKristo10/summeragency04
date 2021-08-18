package com.agency04.sbss.pizza.model;

import org.springframework.beans.factory.annotation.Value;

import java.util.HashSet;

/**
 * Class that represents tuna pizza
 */
public class TonnoPizza implements Pizza {

    @Value("Tono Pizza")
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method return the name of Pizza
     *
     * @return the name of Pizza
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Method returns ingredients of Pizza.
     *
     * @return set of ingredients of Pizza
     */
    @Override
    public HashSet<PizzaIngredient> getIngredients() {
        HashSet<PizzaIngredient> ingredients = new HashSet<PizzaIngredient>();
        ingredients.add(PizzaIngredient.TOMATO_SOUCE);
        ingredients.add(PizzaIngredient.GARLIC);
        ingredients.add(PizzaIngredient.TUNA);
        return ingredients;
    }

    @Override
    public void startStuffs() {
        //which data to initialize??????
        System.out.println("Post-Construct method");
    }

    @Override
    public void endStuffs() {
        System.out.println("Pre-destroy method");
    }
}

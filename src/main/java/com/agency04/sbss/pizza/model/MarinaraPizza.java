package com.agency04.sbss.pizza.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.HashSet;

/**
 * Class that represent Marinara pizza.
 */
@Component
public class MarinaraPizza implements Pizza {

    @Value("Marinara Pizza")
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method return name of Pizza
     * @return name of Pizza
     */
    @Override
    public String getName() {
        return this.name;
    }


    /**
     * Method returns ingredients of pizza
     * @return ingredients of pizza
     */
    @Override
    public HashSet<PizzaIngredient> getIngredients() {
        HashSet<PizzaIngredient> ingredients = new HashSet<>();
        ingredients.add(PizzaIngredient.GARLIC);
        ingredients.add(PizzaIngredient.TOMATO_SOUCE);
        ingredients.add(PizzaIngredient.BASIL);
        return ingredients;
    }
}

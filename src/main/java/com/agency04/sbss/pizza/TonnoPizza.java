package com.agency04.sbss.pizza;

import java.util.HashSet;

/**
 * Class that represents tuna pizza
 */
public class TonnoPizza implements Pizza {
    @Override
    public String getName() {
        return "Tonno Pizza";
    }

    @Override
    public HashSet<PizzaIngredient> getIngredients() {
        HashSet<PizzaIngredient> ingredients = new HashSet<PizzaIngredient>();
        ingredients.add(PizzaIngredient.TOMATO_SOUCE);
        ingredients.add(PizzaIngredient.GARLIC);
        ingredients.add(PizzaIngredient.TUNA);
        return ingredients;
    }
}

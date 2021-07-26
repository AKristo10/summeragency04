package com.agency04.sbss.pizza;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Class that represent Marinara pizza.
 */
public class MarinaraPizza implements Pizza {

    @Override
    public String getName() {
        return "Marinara Pizza";
    }

    @Override
    public HashSet<PizzaIngredient> getIngredients() {
        HashSet<PizzaIngredient> ingredients = new HashSet<PizzaIngredient>();
        ingredients.add(PizzaIngredient.GARLIC);
        ingredients.add(PizzaIngredient.TOMATO_SOUCE);
        ingredients.add(PizzaIngredient.BASIL);
        return ingredients;
    }
}

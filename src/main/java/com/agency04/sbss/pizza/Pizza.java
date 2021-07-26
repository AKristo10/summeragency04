package com.agency04.sbss.pizza;

import java.util.HashSet;

/**
 * Interface that define a simple Pizza.
 * @author Andrea
 */
public interface Pizza {

    /**
     * Method that return name of Pizza.
     * @return name of Pizza
     */
    public String getName();

    /**
     * Method that return ingredients of Pizza.
     * @return ingredients of Pizza.
     */
    public HashSet<PizzaIngredient> getIngredients();
}

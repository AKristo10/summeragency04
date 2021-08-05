package com.agency04.sbss.pizza.model;

import java.util.HashSet;

/**
 * Interface that define a simple Pizza.
 * @author Andrea
 */
public interface Pizza {

    /**
     * Method set the name of the Pizza.
     */
    void setName(String name);

    /**
     * Method that return name of Pizza.
     * @return name of Pizza
     */
     String getName();

    /**
     * Method that return ingredients of Pizza.
     * @return ingredients of Pizza.
     */
     HashSet<PizzaIngredient> getIngredients();
}

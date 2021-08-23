package com.agency04.sbss.pizza.model;

import java.util.HashSet;

/**
 * Interface that define a simple Pizza.
 *
 * @author Andrea
 */
public interface Pizza {

    /**
     * Method set the name of the Pizza.
     */
    void setName(String name);

    void setSize(String size);
    /**
     * Method that return name of Pizza.
     *
     * @return name of Pizza
     */
    String getName();

    /**
     * Method that return ingredients of Pizza.
     *
     * @return ingredients of Pizza.
     */
    HashSet<PizzaIngredient> getIngredients();

    /**
     * Method executes before creating the object, initialize data and print to console
     */
    void startStuffs();

    /**
     * Method executes before destroying the object and print to console
     */
    void endStuffs();
}

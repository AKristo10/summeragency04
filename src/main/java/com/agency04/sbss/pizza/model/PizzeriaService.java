package com.agency04.sbss.pizza.model;

import com.agency04.sbss.pizza.model.Pizza;

/**
 * Interface that represents Pizzeria Service.
 */
public interface PizzeriaService {

    /**
     * Method that set the name of Pizzeria Service
     */

     void setName(String namePizzeria);

    /**
     * Method that set the address of Pizzeria Service
     */
     void setAddress(String address);
    /**
     * Method returns the name of Pizzeria Service.
     * @return name of Pizzeria Service.
     */

     String getName();

    /**
     * Method returns the address of Pizzeria Service.
     * @return address od Pizzeria Service.
     */
     String getAddress();

    /**
     * Method that represents making Pizza.
     * @param pizza
     */
     String makePizza(Pizza pizza);
}

package com.agency04.sbss.pizza;

/**
 * Interface that represents Pizzeria Service.
 */
public interface PizzeriaService {

    /**
     * Method that return name of Pizzeria Service.
     * @return name of Pizzeria Service.
     */
    public String getName();

    /**
     * Method that returns address of Pizzeria Service.
     * @return address od Pizzeria Service.
     */
    public String getAddress();

    /**
     * Method that represents making Pizza.
     * @param pizza
     */
    public String makePizza(Pizza pizza);
}

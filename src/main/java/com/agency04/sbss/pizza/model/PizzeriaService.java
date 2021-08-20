package com.agency04.sbss.pizza.model;

import java.util.List;

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
     *
     * @return name of Pizzeria Service.
     */

    String getName();

    /**
     * Method returns the address of Pizzeria Service.
     *
     * @return address od Pizzeria Service.
     */
    String getAddress();

    /**
     * Method that represents making Pizza.
     *
     * @param pizza
     */
    String makePizza(Pizza pizza);

    /**
     * Method that return menu of pizzeria
     * @return  menu of pizzeria
     */
    List<Pizza> getMenu();

    /**
     * Default method that returns menu in String format.
     * @return menu in String format.
     */
    default String getMenuString(){
            String menuStr = "We can offer: ";
            for(Pizza pizza : getMenu()){
                menuStr += pizza.getName() + " ";
            }
            return menuStr;
    }

}

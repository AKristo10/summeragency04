package com.agency04.sbss.pizza;

/**
 * Represents Pizza Delivery Service
 * @author Andrea
 */
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    /**
     * Set the value of pizzeria service
     * @param pizzeriaService
     */
    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }


    /**
     * Method for ordering pizza.
     * @param pizza sort of pizza for order
     * @return
     */
    public String orderPizza(Pizza pizza){
        return "description of the order";
    }
}

package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.dao.PizzaOrderRepository;
import com.agency04.sbss.pizza.dao.PizzaRepository;
import com.agency04.sbss.pizza.dto.Pizza;
import com.agency04.sbss.pizza.dto.PizzaOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Represents Pizza Delivery Service
 * @author Andrea
 */
public class PizzaDeliveryService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;

    private PizzeriaService pizzeriaService;

    @Autowired
    private CustomerService customerService;

    /**
     * Method add the order to list
     * @param order order in list
     * @throws CustomerNotFoundException if customer does not exist
     * @return just added order
     */
    public PizzaOrder addOrder(PizzaOrder order){
        boolean onTheMenu = false;
        for(Pizza pizza : pizzeriaService.getMenu()){
            if(pizza.equals(order.getPizza().getName()))
                onTheMenu = true;
        }
        if(onTheMenu)
            return  order;
        else
            throw new IllegalArgumentException("Pizza is not on the menu!");
    }

    /**
     * Method returns list of orders
     * @return list of orders
     */
    public List<PizzaOrder> getOrders() {
        return pizzaOrderRepository.findAll();
    }

    /**
     * Set the value of pizzeria service
     * @param thepizzeriaService
     */
    @Autowired
    @Qualifier("bestPizzaPizzeriaService")
    public void setPizzeriaService(PizzeriaService thepizzeriaService) {
        this.pizzeriaService = thepizzeriaService;
    }

    /**
     * Method that returns current pizzeria service.
     * @return current pizzeria service.
     */
    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    /**
     * Method for ordering pizza.
     * @param pizza sort of pizza for order
     * @return
     */
    public String orderPizza(Pizza pizza){
       return pizza.getName()  + " is in your order. Yummy :). Ingredients: " + pizza.getIngredients().toString() + " ";
    }

    public String getInfo(){
        return "The current pizzeria service is " + this.pizzeriaService.getName()
                + ". Address of " + pizzeriaService.getName()
                + " is " + pizzeriaService.getAddress();
    }
}

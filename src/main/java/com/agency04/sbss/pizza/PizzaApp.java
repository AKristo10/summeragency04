package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.MarinaraPizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class for Pizza application
 * @author Andrea
 */
public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PizzaDeliveryService deliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);

        System.out.println(deliveryService.orderPizza(new MarinaraPizza()));

        context.close();

    }

}

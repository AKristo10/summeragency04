package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.MarinaraPizza;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class for Pizza application
 * @author Andrea
 */
public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService deliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println(deliveryService.orderPizza(context.getBean("marinaraPizza", Pizza.class)));

        context.close();

    }

}

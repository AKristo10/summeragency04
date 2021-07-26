package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Path;

/**
 * Main class for Pizza application
 * @author Andrea
 */
public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PizzaDeliveryService deliveryService = context.getBean("PizzaDelivery", PizzaDeliveryService.class);
        Pizza pizza = new MarinaraPizza();
        deliveryService.setPizzeriaService(new BestPizzaPizzeriaService());
        System.out.println(deliveryService.orderPizza(pizza));

        PizzeriaService bestPS = context.getBean("PizzeriaBest", PizzeriaService.class);
        System.out.println(bestPS.getName());

        PizzeriaService italianaPS = context.getBean("PizzeriaItaliana", PizzeriaService.class);
        System.out.println(italianaPS.getName());








    }

}

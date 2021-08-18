package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.MarinaraPizza;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class for Pizza application
 * @author Andrea
 */
@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PizzaApp.class, args);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.agency04.sbss.pizza.controller;

import com.agency04.sbss.pizza.PizzaConfig;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @GetMapping("/")
    public String orderPizza() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService deliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);

        System.out.println(deliveryService.orderPizza(context.getBean("marinaraPizza", Pizza.class)));
        return deliveryService.orderPizza(context.getBean("marinaraPizza", Pizza.class));
    }
}

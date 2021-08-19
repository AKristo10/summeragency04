package com.agency04.sbss.pizza.controller.pizzeria;

import com.agency04.sbss.pizza.PizzaConfig;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @GetMapping("/")
    public String getCurrentPizzeriaInfo(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService deliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        return "The current pizzeria service is " + deliveryService.getPizzeriaService().getName() + ". Address of " +
                deliveryService.getPizzeriaService().getName() + " is " + deliveryService.getPizzeriaService().getAddress() + ". :)";
    }

    @GetMapping("/menu")
    public String getMenu(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService deliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        String menuString = "";
        for(Pizza pizza : deliveryService.getPizzeriaService().getMenu()){
            menuString += pizza.getName() + "\n";
        }
        return menuString;
    }


}

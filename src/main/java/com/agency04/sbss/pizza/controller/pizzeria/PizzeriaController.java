package com.agency04.sbss.pizza.controller.pizzeria;

import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @GetMapping("/")
    public String getCurrentPizzeriaInfo(){
       return pizzaDeliveryService.getInfo();
    }

    @GetMapping("/menu")
    public String getMenu(){
        return pizzaDeliveryService.getPizzeriaService().getMenuString();
    }

}

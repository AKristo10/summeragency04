package com.agency04.sbss.pizza.controller.delivery;



import com.agency04.sbss.pizza.dto.PizzaOrder;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @PostMapping("/order")
    public PizzaOrder postController(@RequestBody PizzaOrder pizzaOrder) {
        return pizzaDeliveryService.addOrder(pizzaOrder);
    }

    @GetMapping("/list")
    public List<PizzaOrder> getOrders(){
        return pizzaDeliveryService.getOrders();
    }

}

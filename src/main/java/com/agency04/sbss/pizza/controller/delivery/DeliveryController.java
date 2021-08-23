package com.agency04.sbss.pizza.controller.delivery;

import com.agency04.sbss.pizza.dto.DeliveryOrderForm;
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
    public DeliveryOrderForm postController(@RequestBody DeliveryOrderForm deliveryOrderForm) {
        return  pizzaDeliveryService.addOrder(deliveryOrderForm);
    }

    @GetMapping("/list")
    public List<DeliveryOrderForm> getCustomer(){
        return pizzaDeliveryService.getOrders();
    }

}

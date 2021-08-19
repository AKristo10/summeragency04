package com.agency04.sbss.pizza.controller.delivery;

import com.agency04.sbss.pizza.controller.customer.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    List<DeliveryOrderForm> orders = new ArrayList<>();

    @PostMapping("/order")
    public DeliveryOrderForm postController(
            @RequestBody DeliveryOrderForm deliveryOrderForm) {
        orders.add(deliveryOrderForm);
        return deliveryOrderForm;
    }

    @GetMapping("/list")
    public List<DeliveryOrderForm> getCustomer(){
        return orders;
    }

}

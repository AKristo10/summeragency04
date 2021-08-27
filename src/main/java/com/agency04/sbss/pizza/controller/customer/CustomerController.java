package com.agency04.sbss.pizza.controller.customer;

import com.agency04.sbss.pizza.dto.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer postController(@RequestBody Customer loginCustomer) {
       return customerService.addCustomer(loginCustomer);
    }

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username){
        return customerService.getCustomerByUsername(username);
    }

    @DeleteMapping("/{username}")
    public void deleteCustomer(@PathVariable String username){
       customerService.deleteCustomerByUsername(username);
    }

    @PutMapping("/{username}")
    public Customer updateCustomer(@PathVariable String username, @RequestBody Customer loginCustomer){
        return customerService.updateCustomerByUsername(username, loginCustomer);
    }

}

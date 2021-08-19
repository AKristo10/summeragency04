package com.agency04.sbss.pizza.controller.customer;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    List<Customer> customers = new ArrayList<>();

    @PostMapping("/")
    public Customer postController(
            @RequestBody Customer loginCustomer) {
        customers.add(loginCustomer);
        return loginCustomer;
    }

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username){

        for(Customer customer : customers){
            if(customer.getUsername().equals(username)){
                return customer;
            }
        }
        throw new CustomerNotFoundException("Customer " + username + " does not exist!");
    }

    @DeleteMapping("/{username}")
    public String deleteCustomer(@PathVariable String username){
        for(Customer customer : customers){
            if(customer.getUsername().equals(username)){
                customers.remove(customer);
                return username + " is deleted.";
            }
        }
        throw new CustomerNotFoundException("Customer " + username + " does not exist!");
    }

    @PutMapping("/{username}")
    public String updateCustomer(@PathVariable String username, @RequestBody Customer loginCustomer){
        for(Customer customer : customers){
            if(customer.getUsername().equals(username)){
                customer.setUsername(loginCustomer.getUsername());
                customer.setPassword(loginCustomer.getPassword());
                return "Password and username are updated!" ;
            }
        }
        throw new CustomerNotFoundException("Customer " + username + " does not exist!");
    }

}

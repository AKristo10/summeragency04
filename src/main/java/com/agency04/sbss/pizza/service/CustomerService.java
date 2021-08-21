package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerService {

    Set<Customer> customers = new HashSet<>();

    /**
     * Method returns set of customers.
     * @return set of customers.
     */
    public Set<Customer> getCustomers() {
        return customers;
    }


    /**
     * Method add customer in set
     * @param customer customer that will be added
     * @return just added customer
     */
    public Customer addCustomer(Customer customer){
        if(customer != null) {
            customers.forEach(customer1 -> {
                if (customer1.getUsername().equals(customer.getUsername()) && customer1.getPassword().equals(customer.getPassword())){
                    throw new CustomerNotFoundException("Customer has already added!");
                }
            });
            customers.add(customer);
            return customer;
        }
        else
            throw new NullPointerException();
    }


    /**
     * Method returns Customer by username.
     * @param username
     * @throws CustomerNotFoundException if customer does not exist
     * @return Customer by username
     */
    public Customer getCustomerByUsername(String username){
        Customer customerUsername = customers.stream().filter(customer -> username.equals(customer.getUsername()))
                .findAny().orElse(null);
        if(customerUsername == null)
            throw  new CustomerNotFoundException("Customer " + username + " does not exist!");
        else
            return customerUsername;
    }


    /**
     * Method updates data about customer
     * @param username Customer's username
     * @param customer
     * @throws CustomerNotFoundException if customer does not exist
     * @return updated customer
     */
    public Customer updateCustomerByUsername(String username, Customer customer){
        Customer customerUsername = customers.stream().filter(c -> username.equals(c.getUsername()))
                .findAny().orElse(null);
        if(customerUsername != null){
            customerUsername.setUsername(customer.getUsername());
            customerUsername.setPassword(customer.getPassword());
            return customerUsername;
        }
        else
            throw  new CustomerNotFoundException("Customer " + username + " does not exist!");
    }


    /**
     * Method delete customer by customer's username
     * @param username Customer's username
     * @return just deleted customer.
     * @throws CustomerNotFoundException if customer does not exist
     */
    public Customer deleteCustomerByUsername(String username){
        Customer deletedCustomer = customers.stream().filter(c -> username.equals(c.getUsername()))
                .findAny().orElse(null);

        if(deletedCustomer != null)
            customers.remove(deletedCustomer);
        else
            throw  new CustomerNotFoundException("Customer " + username + " does not exist!");

        return deletedCustomer;
    }
}

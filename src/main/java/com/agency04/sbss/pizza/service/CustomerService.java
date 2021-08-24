package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.dao.CustomerRepository;
import com.agency04.sbss.pizza.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Method returns set of customers.
     * @return set of customers.
     */
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }


    /**
     * Method add customer in set
     * @param customer customer that will be added
     * @return just added customer
     */
    public Customer addCustomer(Customer customer){
        if(customer != null){
            customerRepository.findAll().forEach(c -> {
                if(c.equals(customer))
                    throw new CustomerNotFoundException("Customer has already added!");
            });
            customerRepository.save(customer);
            return customer;
        }
        else
            throw new NullPointerException("Customer can not be null!");
    }


    /**
     * Method returns Customer by username.
     * @param username
     * @throws CustomerNotFoundException if customer does not exist
     * @return Customer by username
     */
    public Customer getCustomerByUsername(String username){
        Customer customer = customerRepository.findByUsername(username);
        if(customer == null)
            throw  new CustomerNotFoundException("Customer " + username + " does not exist!");
        else
            return customer;
    }


    /**
     * Method updates data about customer
     * @param username Customer's username
     * @param customer
     * @throws CustomerNotFoundException if customer does not exist
     * @return updated customer
     */
    public Customer updateCustomerByUsername(String username, Customer customer){
        Customer customerUsername = customerRepository.findByUsername(username);
        if(customerUsername != null){
            customerUsername.setUsername(customer.getUsername());
            customerUsername.setCustomerDetails(customer.getCustomerDetails());
            customerUsername.setDelivery(customer.getDelivery());
            customerRepository.save(customerUsername);
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
    public void deleteCustomerByUsername(String username){


        customerRepository.delete(customerRepository.findByUsername(username));


    }
}

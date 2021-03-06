package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.controller.customer.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.dao.*;
import com.agency04.sbss.pizza.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;
    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private PizzaRepository pizzaRepository;

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
            customerDetailsRepository.save(customer.getCustomerDetails());
            for(Delivery delivery : customer.getDelivery()){
                for(PizzaOrder pizzaOrder : delivery.getPizzaOrder()){
                    pizzaRepository.save(pizzaOrder.getPizza());
                    pizzaOrderRepository.save(pizzaOrder);
                }
                deliveryRepository.save(delivery);
            }
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
            customerDetailsRepository.save(customer.getCustomerDetails());
            customerUsername.setCustomerDetails(customer.getCustomerDetails());
            List<PizzaOrder> orders = new ArrayList<>();
            List<Delivery> deliveries = new ArrayList<>();
            for(Delivery delivery : customer.getDelivery()){
                for(PizzaOrder pizzaOrder : delivery.getPizzaOrder()){
                    pizzaRepository.save(pizzaOrder.getPizza());
                    pizzaOrder.setPizza(pizzaOrder.getPizza());
                    pizzaOrderRepository.save(pizzaOrder);
                    orders.add(pizzaOrder);
                }
                delivery.setPizzaOrder(orders);
                deliveryRepository.save(delivery);
            }
            customerUsername.setDelivery(deliveries);
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
        for(Customer customer : customerRepository.findAll()){
            if(customer.getUsername().equals(username)){
                customerRepository.delete(customerRepository.findByUsername(username));
                return;
            }
        }
        throw  new CustomerNotFoundException("Customer "+ username + " does not exist!");
    }
}

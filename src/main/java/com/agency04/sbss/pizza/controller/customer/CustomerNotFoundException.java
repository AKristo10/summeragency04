package com.agency04.sbss.pizza.controller.customer;

public class CustomerNotFoundException extends  RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }

}

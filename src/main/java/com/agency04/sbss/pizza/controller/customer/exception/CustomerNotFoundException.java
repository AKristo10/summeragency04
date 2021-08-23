package com.agency04.sbss.pizza.controller.customer.exception;

public class CustomerNotFoundException extends  RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }

}

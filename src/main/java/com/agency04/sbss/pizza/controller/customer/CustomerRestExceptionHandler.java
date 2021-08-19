package com.agency04.sbss.pizza.controller.customer;

import com.agency04.sbss.pizza.controller.customer.CustomerErrorResponse;
import com.agency04.sbss.pizza.controller.customer.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class CustomerRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exception){
        CustomerErrorResponse err = new CustomerErrorResponse();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exception.getMessage());

        return new ResponseEntity<CustomerErrorResponse>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(Exception exception){
        CustomerErrorResponse err = new CustomerErrorResponse();
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        err.setMessage(exception.getMessage());

        return new ResponseEntity<CustomerErrorResponse>(err, HttpStatus.BAD_REQUEST);
    }

}

package com.agency04.sbss.pizza.controller.customer;

public class CustomerErrorResponse {
    private int status;
    private String message;

    public CustomerErrorResponse(){}

    public CustomerErrorResponse(int status, String message){
        this.status = status;
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

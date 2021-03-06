package com.agency04.sbss.pizza.controller.customer.exception;

public class CustomerErrorResponse {
    private int status;
    private String message;

    public CustomerErrorResponse(){}

    public CustomerErrorResponse(int status, String message){
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

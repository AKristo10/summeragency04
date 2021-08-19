package com.agency04.sbss.pizza.model;

public class Customer {

    private String username;
    private String password;

    public Customer(){}

    public Customer (String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

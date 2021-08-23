package com.agency04.sbss.pizza.model;

import java.util.Objects;

/**
 * The class that represents Customer
 *
 * @author Andrea
 */
public class Customer {

    private String username;
    private String password;

    /**
     * Empty constructor
     */
    public Customer(){}

    /**
     * Constructor that set the value od username
     * @param username
     */
    public Customer(String username){
        this.username = username;
    }
    /**
     * Constructor that set values of username and password
     * @param username value of username
     * @param password value of password
     */
    public Customer (String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(username, customer.username) && Objects.equals(password, customer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    /**
     * Method that set value of password
     * @param password value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method that return value of password
     * @return value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method that return value of username
     * @return value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Method that set value of username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }
}

package com.agency04.sbss.pizza.dto;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn
    @ManyToOne
    private Customer customer;

    @Column
    private Date submissionDate;

    @Column
    @OneToMany
    private List<PizzaOrder> pizzaOrder;

    public  Delivery(){}

    public Delivery(Customer customer, Date submissionDate, List<PizzaOrder> pizzaOrder){
        this.customer = customer;
        this.submissionDate = submissionDate;
        this.pizzaOrder = pizzaOrder;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPizzaOrder(List<PizzaOrder> pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public List<PizzaOrder> getPizzaOrder() {
        return pizzaOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id) && Objects.equals(customer, delivery.customer) && Objects.equals(submissionDate, delivery.submissionDate) && Objects.equals(pizzaOrder, delivery.pizzaOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, submissionDate, pizzaOrder);
    }
}

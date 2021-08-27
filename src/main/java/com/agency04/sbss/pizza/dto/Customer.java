package com.agency04.sbss.pizza.dto;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column
   private String username;

   @JoinColumn
   @OneToOne
   private CustomerDetails customerDetails;

   @OneToMany
   @Column
   private List<Delivery> delivery;

   public Customer(){}

   public Customer(String username, CustomerDetails customerDetails, List<Delivery> delivery){
      this.username = username;
      this.customerDetails = customerDetails;
      this.delivery = delivery;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUsername() {
      return username;
   }

   public void setCustomerDetails(CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }

   public CustomerDetails getCustomerDetails() {
      return customerDetails;
   }

   public void setDelivery(List<Delivery> delivery) {
      this.delivery = delivery;
   }

   public List<Delivery> getDelivery() {
      return delivery;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Customer customer = (Customer) o;
      return Objects.equals(id, customer.id) && Objects.equals(username, customer.username) && Objects.equals(customerDetails, customer.customerDetails) && Objects.equals(delivery, customer.delivery);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, username, customerDetails, delivery);
   }
}

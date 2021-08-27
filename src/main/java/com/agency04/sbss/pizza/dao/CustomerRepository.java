package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByUsername(String username);

}

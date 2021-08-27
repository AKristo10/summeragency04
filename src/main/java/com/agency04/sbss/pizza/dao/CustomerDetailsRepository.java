package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.dto.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
}

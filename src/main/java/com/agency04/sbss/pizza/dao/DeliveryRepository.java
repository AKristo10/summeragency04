package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.dto.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}

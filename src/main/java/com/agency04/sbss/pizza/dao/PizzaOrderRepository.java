package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.dto.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {
}

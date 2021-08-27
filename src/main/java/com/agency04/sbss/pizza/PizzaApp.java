package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.dao.PizzaRepository;
import com.agency04.sbss.pizza.dto.Pizza;
import com.agency04.sbss.pizza.model.PizzaIngredient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Main class for Pizza application
 *
 * @author Andrea
 */
@SpringBootApplication
public class PizzaApp {

    private final PizzaRepository pizzaRepository;

    public PizzaApp(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public static void main(String[] args) {
        try {
            SpringApplication.run(PizzaApp.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    private void fillTestData() {
        pizzaRepository.save(
                new Pizza(
                        "Slavonska",
                        new ArrayList<PizzaIngredient>(Collections.singletonList(PizzaIngredient.BACON)),
                        Collections.emptyList()
                )
        );
    }
}
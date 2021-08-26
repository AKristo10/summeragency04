package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.service.BestPizzaPizzeriaService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza.model")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean
    public PizzaDeliveryService pizzaDeliveryService() {
        return new PizzaDeliveryService();
    }

    @Bean
    @Primary
    public BestPizzaPizzeriaService bestPizzaPizzeriaService() {
        return new BestPizzaPizzeriaService();
    }

}

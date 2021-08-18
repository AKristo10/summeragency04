package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.MarinaraPizza;
import com.agency04.sbss.pizza.model.TonnoPizza;
import com.agency04.sbss.pizza.model.BestPizzaPizzeriaService;
import com.agency04.sbss.pizza.model.ItalianaPizzeriaService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza.model")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean
    @Primary
    public ItalianaPizzeriaService italianaPizzeriaService(){
        return new ItalianaPizzeriaService();
    }

    @Bean
    public BestPizzaPizzeriaService bestPizzaPizzeriaService(){
        return  new BestPizzaPizzeriaService();
    }

    @Bean
    @Primary
    public MarinaraPizza marinaraPizza(){
        return  new MarinaraPizza();
    }

    @Bean
    public TonnoPizza tonnoPizza(){
        return  new TonnoPizza();
    }

}

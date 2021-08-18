package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @GetMapping("/")
    public String orderPizza() {
        return "obicni string za isprobavanje";
    }
}

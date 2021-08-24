package com.agency04.sbss.pizza.dto;

import com.agency04.sbss.pizza.model.PizzaIngredient;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String name;

    @ElementCollection(targetClass = PizzaIngredient.class)
    @CollectionTable @Enumerated(EnumType.STRING)
    private List<PizzaIngredient> ingredients;

    @Column
    @OneToMany
    private List<PizzaOrder> pizzaOrder;

    public Pizza(){}

    public Pizza(String name, List<PizzaIngredient> ingredients, List<PizzaOrder> pizzaOrder){
        this.name = name;
        this.ingredients = ingredients;
        this.pizzaOrder = pizzaOrder;
    }

    public void setPizzaOrder(List<PizzaOrder> pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<PizzaIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public List<PizzaOrder> getPizzaOrder() {
        return pizzaOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(id, pizza.id) && Objects.equals(name, pizza.name) && Objects.equals(ingredients, pizza.ingredients) && Objects.equals(pizzaOrder, pizza.pizzaOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ingredients, pizzaOrder);
    }
}

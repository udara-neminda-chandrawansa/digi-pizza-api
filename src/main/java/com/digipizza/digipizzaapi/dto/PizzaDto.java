package com.digipizza.digipizzaapi.dto;

import jakarta.persistence.Id;

public class PizzaDto {

    // attribs
    @Id
    private int pizzaId;
    private String pizzaName;
    private String crusts;
    private String sauces;
    private String toppings;
    private String cheeses;
    private String description;
    private Double price;

    // no-args constructor
    public PizzaDto() {
    }

    // all-args constructor
    public PizzaDto(int pizzaId, String pizzaName, String crusts, String sauces, String toppings, String cheeses, String description, Double price) {
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.crusts = crusts;
        this.sauces = sauces;
        this.toppings = toppings;
        this.cheeses = cheeses;
        this.description = description;
        this.price = price;
    }

    // getters and setters
    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getCrusts() {
        return crusts;
    }

    public void setCrusts(String crusts) {
        this.crusts = crusts;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCheeses() {
        return cheeses;
    }

    public void setCheeses(String cheeses) {
        this.cheeses = cheeses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

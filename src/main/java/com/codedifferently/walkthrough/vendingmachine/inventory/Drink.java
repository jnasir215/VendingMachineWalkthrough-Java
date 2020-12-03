package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Drink extends Product {

    public Drink(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Gulp Gulp, Yum!";
    }

    public Drink() {

        this("Fruit Punch", 1.49);
    }

    @Override
    public String message() {

        return msg;
    }
}

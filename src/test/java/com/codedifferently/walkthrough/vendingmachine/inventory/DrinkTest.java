package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class DrinkTest {

    @Test
    public void constructorTest() {
        // Given
        String name = "Fruit Punch";
        Double price = 1.49;
        Drink drinkRef = new Drink(name, price);

        // When
        String expected = "Fruit Punch 1.49";
        String actual = drinkRef.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Drink drinkRef = new Drink();

        // When
        String expected = "Gulp Gulp, Yum!";
        String actual = drinkRef.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

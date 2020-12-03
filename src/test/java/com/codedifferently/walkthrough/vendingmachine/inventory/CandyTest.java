package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void constructorTest() {
        // Given
        String name = "Nestle Crunch";
        Double price = 0.75;
        Candy candyRef = new Candy(name, price);

        // When
        String expected = "Nestle Crunch 0.75";
        String actual = candyRef.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Candy candyRef = new Candy();

        // When
        String expected = "Munch Munch, Yum!";
        String actual = candyRef.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

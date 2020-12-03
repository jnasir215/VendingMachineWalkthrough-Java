package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class ChipsTest {

    @Test
    public void constructorTest() {
        // Given
        String name = "Frito Lay";
        Double price = 1.29;
        Chips chipsRef = new Chips(name, price);

        // When
        String expected = "Frito Lay 1.29";
        String actual = chipsRef.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest() {
        // Given
        Chips chipsRef = new Chips();

        // When
        String expected = "Crunch Crunch, Yum!";
        String actual = chipsRef.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

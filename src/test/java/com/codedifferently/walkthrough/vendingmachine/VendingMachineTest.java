package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {
    private final static Logger logger = Logger.getLogger(VendingMachineTest.class);

    @Test
    public void stockVendingMachineTestChips() {
        // Given
        String[] sample = {"A1|Frito Lay|Chips|1.29"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        // When
        Product expctdChips = new Chips("Frito Lay", 1.29);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actlChips = inventory.get("A1");

        // Then
        Assert.assertEquals(expctdChips.getName(), actlChips.getName());
    }

    @Test
    public void stockVendingMachineTestCandy() {
        // Given
        String[] sample = {"A2|Nestle Crunch|Candy|0.75"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        // When
        Product expctdCandy = new Candy("Nestle Crunch", 0.75);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actlCandy = inventory.get("A2");

        // Then
        Assert.assertEquals(expctdCandy.getName(), actlCandy.getName());
    }

    @Test
    public void stockVendingMachineTestGum() {
        // Given
        String[] sample = {"A3|Rhino Chew|Gum|0.35"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        // When
        Product expctdGum = new Gum("Rhino Chew", 0.35);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actlGum = inventory.get("A3");

        // Then
        Assert.assertEquals(expctdGum.getName(), actlGum.getName());
    }

    @Test
    public void stockVendingMachineTestDrink() {
        // Given
        String[] sample = {"A4|Fruit Punch|Drink|1.49"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        // When
        Product expctdDrink = new Drink("Fruit Punch", 1.49);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actlDrink = inventory.get("A4");

        // Then
        Assert.assertEquals(expctdDrink.getName(), actlDrink.getName());
    }
}

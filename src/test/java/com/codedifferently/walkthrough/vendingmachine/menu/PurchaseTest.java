package com.codedifferently.walkthrough.vendingmachine.menu;

import com.codedifferently.walkthrough.vendingmachine.VendingMachine;
import org.junit.Assert;
import org.junit.Test;

public class PurchaseTest {

    @Test
    public void feedMoneyTest() {
        // Given
        Double money = 2.00;
        Purchase purchase = new Purchase(money);

        // When
        Double expctdMoney = 2.00;
        Double actlMoney = purchase.feedMoney(money);

        // Then
        Assert.assertEquals(expctdMoney, actlMoney);
    }
}

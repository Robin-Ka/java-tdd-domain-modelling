package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BasketTest {

    @Test
    public void addProductNotInBasket(){
        // Setup
        Basket basket = new Basket();
        String productName = "crisps";
        int price = 30;

        // Execute and verify
        Assertions.assertTrue(basket.add(productName, price));
    }

    @Test
    public void addProductAlreadyInBasket(){
        // Setup
        Basket basket = new Basket();
        String productName = "crisps";
        int price = 30;

        basket.add(productName, price);

        // Execute and verify
        Assertions.assertFalse(basket.add(productName, price));
    }

}

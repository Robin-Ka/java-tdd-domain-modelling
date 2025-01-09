package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
        if (!items.containsKey(product)){
            items.put(product, price);
            return true;
        }
        return false;
    }

    public int total(){
        int totalCost = 0;

        for (Integer price : items.values()){
            totalCost += price;
        }

        return totalCost;
    }

}

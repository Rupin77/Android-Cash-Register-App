package com.example.assignment2;

import java.util.ArrayList;

public class ManagerHistory {
    ArrayList<ProductHistory> allProductHistories = new ArrayList<>(0);

    public void addProductHistory(ProductHistory productHistory){
        allProductHistories.add(productHistory);
    }
}
package com.example.assignment2;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> allProducts = new ArrayList<>(0);

    public void addProduct(Product product){
        allProducts.add(product);
    }
}
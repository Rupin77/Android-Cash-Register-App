package com.example.assignment2;

import android.app.Application;

public class MyApp extends Application {
    ProductManager productManager = new ProductManager();
    Product mainProduct = new Product();
    Product[] availableProducts = new Product[] {
            new Product("Pants", 10, 20.44),
            new Product("Shoes", 100, 10.44),
            new Product("Hat", 30, 5.90)
    };
    ManagerHistory historyManager = new ManagerHistory();

    @Override
    public void onCreate() {
        super.onCreate();

        for (Product product : this.availableProducts) {
            productManager.addProduct(product);
        }
    }
}

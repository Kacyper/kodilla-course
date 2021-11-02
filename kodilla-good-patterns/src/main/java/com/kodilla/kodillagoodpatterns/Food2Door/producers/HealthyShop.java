package com.kodilla.kodillagoodpatterns.Food2Door.producers;


import com.kodilla.kodillagoodpatterns.Food2Door.product.Products;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class HealthyShop implements Producer {

    private static final Map<String, Products> ordersHealthyShop = new HashMap<>();


    public boolean process(final Products products, final int quantity) {

        System.out.println("HealthyShop is adding an order.");

        String orderID = LocalDate.now().toString().replace("-", ":");

        ordersHealthyShop.put(orderID, products);
        System.out.println(ordersHealthyShop);
        return false;
    }
}

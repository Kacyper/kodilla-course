package com.kodilla.kodillagoodpatterns.Food2Door.producers;


import com.kodilla.kodillagoodpatterns.Food2Door.product.Products;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class GlutenFreeShop implements Producer {

    private static final Map<String, Products> ordersGlutenFree = new HashMap<>();


    public boolean process(final Products products, final int quantity) {

        System.out.println("GlutenFreeShop is adding an order.");

        String orderID = LocalDate.now().toString().replace("-", ":");

        ordersGlutenFree.put(orderID, products);
        System.out.println(ordersGlutenFree);
        return false;
    }
}

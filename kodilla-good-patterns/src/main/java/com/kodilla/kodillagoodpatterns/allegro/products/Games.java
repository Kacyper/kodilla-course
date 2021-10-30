package com.kodilla.kodillagoodpatterns.allegro.products;

public class Games implements Product {

    private final String productName;
    private final double productPrice;

    public Games(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }
}

package com.kodilla.kodillagoodpatterns.Food2Door.product;

import java.util.Objects;

public class FoodProducts implements Products {

    private final String productName;
    private final double productPrice;
    private final int productId;

    public FoodProducts(String productName, double productPrice, int productId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productId = productId;
    }


    @Override
    public String productName() {
        return null;
    }

    @Override
    public Integer productId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodProducts that = (FoodProducts) o;
        return Double.compare(that.productPrice, productPrice) == 0 && productId == that.productId && productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productId);
    }

    @Override
    public String toString() {
        return " Food products ordered: " +
                "'" + productName + '\'' +
                ", Price: " + productPrice + " PLN.";
    }
}

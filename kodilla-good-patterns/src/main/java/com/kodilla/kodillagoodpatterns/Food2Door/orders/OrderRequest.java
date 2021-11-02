package com.kodilla.kodillagoodpatterns.Food2Door.orders;

public class OrderRequest {

    private final int productId;
    private final int quantity;
    private final boolean ifOrdered;


    public OrderRequest(int productId, int quantity, boolean ifOrdered) {
        this.productId = productId;
        this.quantity = quantity;
        this.ifOrdered = ifOrdered;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isIfOrdered() {
        return ifOrdered;
    }
}

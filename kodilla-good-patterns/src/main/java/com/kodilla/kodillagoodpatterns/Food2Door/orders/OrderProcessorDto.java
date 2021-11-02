package com.kodilla.kodillagoodpatterns.Food2Door.orders;

public class OrderProcessorDto {

    private final OrderRequest orderRequest;
    private final boolean ifOrdered;

    public OrderProcessorDto(OrderRequest orderRequest, boolean ifOrdered) {
        this.orderRequest = orderRequest;
        this.ifOrdered = ifOrdered;
    }

    public void showOrderStatus() {
        System.out.println("Has product " + orderRequest.getProductId() + " been ordered? " + orderRequest.isIfOrdered());
    }

}

package com.kodilla.kodillagoodpatterns.allegro.service;

import com.kodilla.kodillagoodpatterns.allegro.orders.OrderRequest;

public class ProductOrderService {

    public boolean orderProduct (OrderRequest orderRequest) {
        double totalPrice = orderRequest.getProduct().getProductPrice() * orderRequest.getQuantity();

        System.out.println("Ordering this product: " + orderRequest.getProduct().getProductName() + " for "
                + orderRequest.getProduct().getProductPrice() + " PLN " + " by "
                + orderRequest.getUser().getNickName() + ". Qty: " + orderRequest.getQuantity()
                + " for the total price of " + totalPrice + " PLN.");

        return true;
    }
}

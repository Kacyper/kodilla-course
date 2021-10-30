package com.kodilla.kodillagoodpatterns.allegro.orders;

import com.kodilla.kodillagoodpatterns.allegro.products.Product;
import com.kodilla.kodillagoodpatterns.allegro.user.User;

public class OrderRequest implements Order {

    private final User user;
    private final Product product;
    private final int quantity;


    public OrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}

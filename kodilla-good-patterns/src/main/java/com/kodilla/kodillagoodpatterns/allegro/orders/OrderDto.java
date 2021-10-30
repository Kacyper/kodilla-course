package com.kodilla.kodillagoodpatterns.allegro.orders;

import com.kodilla.kodillagoodpatterns.allegro.products.Product;
import com.kodilla.kodillagoodpatterns.allegro.user.User;

public class OrderDto {
    public User user;
    public Product product;
    public boolean isProductOrdered;

    public OrderDto(User user, Product product, boolean isProductOrdered) {
        this.user = user;
        this.product = product;
        this.isProductOrdered = isProductOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isProductOrdered() {
        return isProductOrdered;
    }
}

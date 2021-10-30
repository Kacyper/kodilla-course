package com.kodilla.kodillagoodpatterns.allegro.orders;

import com.kodilla.kodillagoodpatterns.allegro.products.Product;
import com.kodilla.kodillagoodpatterns.allegro.user.User;

public interface Order {

    User getUser();

    Product getProduct();

}

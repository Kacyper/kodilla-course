package com.kodilla.kodillagoodpatterns.allegro.orders;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder(final Order order, final LocalDate localDate);

    void showOrder();
}

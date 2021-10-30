package com.kodilla.kodillagoodpatterns.allegro.products;

import com.kodilla.kodillagoodpatterns.allegro.orders.Order;
import com.kodilla.kodillagoodpatterns.allegro.orders.OrderRepository;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductOrderRespository implements OrderRepository {

    private final Map<String, Order> orders = new HashMap<>();
    private LocalDate orderDate = LocalDate.now();
    private Integer numberOrderDay = 0;

    @Override
    public void createOrder(final Order order, final LocalDate localDate) {
        if (orderDate.equals(localDate)) {
            numberOrderDay++;
        } else if (orderDate.isBefore(localDate)) {
            numberOrderDay = 0;
            orderDate = localDate;
        }
        String numberOrderDays = localDate.toString().replace("-", ":") + " " + numberOrderDay;
        orders.put(numberOrderDays, order);
    }
    
    public void showOrder() {
        System.out.println("Orders are:");
        
        for (Map.Entry<String, Order> entry : orders.entrySet()) {
            System.out.println("Order day: " + entry.getKey() +
                    " Ordered product: " + entry.getValue().getProduct().getProductName() +
                    ". Order placed by: " + entry.getValue().getUser().getFirstName() + " " +
                    entry.getValue().getUser().getLastName() + " " +
                    entry.getValue().getUser().getNickName() + ".");
        }
    }

}

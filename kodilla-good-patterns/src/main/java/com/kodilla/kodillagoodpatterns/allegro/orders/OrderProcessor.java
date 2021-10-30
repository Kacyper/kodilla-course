package com.kodilla.kodillagoodpatterns.allegro.orders;

import com.kodilla.kodillagoodpatterns.allegro.service.ProductOrderService;

import java.time.LocalDate;

public class OrderProcessor {

    private final ProductOrderService productOrderService;
    private final OrderRepository orderRepository;



    public OrderProcessor(ProductOrderService productOrderService, OrderRepository orderRepository) {
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.orderProduct(orderRequest);
        if (isOrdered) {
            orderRepository.createOrder(orderRequest, LocalDate.now());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}

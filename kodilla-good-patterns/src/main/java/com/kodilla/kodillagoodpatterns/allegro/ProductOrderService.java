package com.kodilla.kodillagoodpatterns.allegro;

import com.kodilla.kodillagoodpatterns.allegro.orders.OrderDto;
import com.kodilla.kodillagoodpatterns.allegro.orders.OrderProcessor;
import com.kodilla.kodillagoodpatterns.allegro.orders.OrderRequest;
import com.kodilla.kodillagoodpatterns.allegro.products.Books;
import com.kodilla.kodillagoodpatterns.allegro.products.Games;
import com.kodilla.kodillagoodpatterns.allegro.products.ProductOrderRespository;
import com.kodilla.kodillagoodpatterns.allegro.user.User;

public class ProductOrderService extends com.kodilla.kodillagoodpatterns.allegro.service.ProductOrderService {
    public static void main(String[] args) {

        OrderRequest order1 = new OrderRequest(new User("Mike", "Smith", "Smithy"),new Games("Fifa 22", 199.99), 1);
        OrderRequest order2 = new OrderRequest(new User("Sam", "White", "Blacky"), new Books("How to get rich?", 29.99), 1);

        ProductOrderRespository productOrderRespository = new ProductOrderRespository();
        OrderProcessor processor = new OrderProcessor(new ProductOrderService(), productOrderRespository);

        OrderDto dto1 = processor.process(order1);
        System.out.println(dto1.getUser().getNickName() + " ordered: " + dto1.getProduct().getProductName());

        OrderDto dto2 = processor.process(order2);
        System.out.println(dto2.getUser().getNickName() + " ordered: " + dto2.getProduct().getProductName());

        productOrderRespository.showOrder();

    }
}

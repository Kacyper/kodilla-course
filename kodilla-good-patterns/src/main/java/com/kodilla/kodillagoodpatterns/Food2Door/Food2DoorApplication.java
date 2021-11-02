package com.kodilla.kodillagoodpatterns.Food2Door;

import com.kodilla.kodillagoodpatterns.Food2Door.orders.OrderProcessor;
import com.kodilla.kodillagoodpatterns.Food2Door.orders.OrderProcessorDto;
import com.kodilla.kodillagoodpatterns.Food2Door.orders.OrderRequest;
import com.kodilla.kodillagoodpatterns.Food2Door.product.ProductsRespository;

public class Food2DoorApplication {
    public static void main(String[] args) {

        ProductsRespository productsRespository = new ProductsRespository();

        OrderRequest order1 = new OrderRequest(1, 2, true);
        OrderRequest order2 = new OrderRequest(3, 4, false);
        OrderRequest order3 = new OrderRequest(5, 5, false);
        OrderRequest order4 = new OrderRequest(2, 10, true);
        OrderRequest order5 = new OrderRequest(6, 12, true);

        OrderProcessor orderProcessor = new OrderProcessor(productsRespository);

        OrderProcessorDto orderProcessorDto1 = orderProcessor.processorOrder(order1);
        OrderProcessorDto orderProcessorDto2 = orderProcessor.processorOrder(order2);
        OrderProcessorDto orderProcessorDto3 = orderProcessor.processorOrder(order3);
        OrderProcessorDto orderProcessorDto4 = orderProcessor.processorOrder(order4);
        OrderProcessorDto orderProcessorDto5 = orderProcessor.processorOrder(order5);

        orderProcessorDto1.showOrderStatus();
        orderProcessorDto2.showOrderStatus();
        orderProcessorDto3.showOrderStatus();
        orderProcessorDto4.showOrderStatus();
        orderProcessorDto5.showOrderStatus();

    }
}

package com.kodilla.kodillagoodpatterns.Food2Door.orders;

import com.kodilla.kodillagoodpatterns.Food2Door.producers.Producer;
import com.kodilla.kodillagoodpatterns.Food2Door.product.ProductsRespository;

public class OrderProcessor {

    private final ProductsRespository productsRespository;

    public OrderProcessor(ProductsRespository productsRespository) {
        this.productsRespository = productsRespository;
    }

    public OrderProcessorDto processorOrder (OrderRequest orderRequest) {
        Producer producer = productsRespository.getDelivery(orderRequest.getProductId());

        boolean ifOrdered = producer.process(productsRespository.getProduct(orderRequest.getProductId()), orderRequest.getQuantity());
        return new OrderProcessorDto(orderRequest, ifOrdered);
    }

}

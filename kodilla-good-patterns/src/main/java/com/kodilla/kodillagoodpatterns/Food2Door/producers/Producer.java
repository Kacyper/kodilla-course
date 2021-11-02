package com.kodilla.kodillagoodpatterns.Food2Door.producers;


import com.kodilla.kodillagoodpatterns.Food2Door.product.Products;

public interface Producer {

    boolean process(final Products products, final int quantity);
}

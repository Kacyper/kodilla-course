package com.kodilla.kodillagoodpatterns.Food2Door.product;

import com.kodilla.kodillagoodpatterns.Food2Door.producers.ExtraFoodShop;
import com.kodilla.kodillagoodpatterns.Food2Door.producers.GlutenFreeShop;
import com.kodilla.kodillagoodpatterns.Food2Door.producers.HealthyShop;
import com.kodilla.kodillagoodpatterns.Food2Door.producers.Producer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsRespository {

    private final List<Products> products = new ArrayList<>();
    private final Map<Integer, Producer> producerMap = new HashMap<>();

    public ProductsRespository() {
        Producer extraFoodShop = new ExtraFoodShop();
        Producer glutenFreeShop = new GlutenFreeShop();
        Producer healthyShop = new HealthyShop();

        products.add(new FoodProducts("Apple", 1.2, 1));
        products.add(new FoodProducts("Carrot", 0.2, 2));
        products.add(new FoodProducts("Cherry", 0.5, 3));
        products.add(new FoodProducts("Bread",2, 4));
        products.add(new FoodProducts("Ham", 3, 5));
        products.add(new FoodProducts("Milk", 1, 6));

        producerMap.put(products.get(0).productId(), glutenFreeShop);
        producerMap.put(products.get(1).productId(), glutenFreeShop);
        producerMap.put(products.get(2).productId(), healthyShop);
        producerMap.put(products.get(3).productId(), extraFoodShop);
        producerMap.put(products.get(4).productId(), extraFoodShop);
        producerMap.put(products.get(5).productId(),healthyShop);
    }

    public Producer getDelivery(int productId) {
        return producerMap.get(productId);
    }

    public Products getProduct(int productId) {
        return products.stream()
                .filter(products -> products.productId() == productId)
                .findAny().orElseThrow(IllegalArgumentException::new);
    }

}

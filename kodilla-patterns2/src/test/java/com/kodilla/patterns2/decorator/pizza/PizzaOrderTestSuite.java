package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription () {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you.", pizzaDescription);
    }

    @Test
    public void testBasicPizzaAndHamGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testBasicPizzaAndHamGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        String pizzaDescriptionWithHam = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you. + ham", pizzaDescriptionWithHam);
    }

    @Test
    public void testBasicPizzaAndCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testBasicPizzaAndCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        String pizzaDescriptionWithHam = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you. + cheese", pizzaDescriptionWithHam);
    }

    @Test
    public void testBasicPizzaAndMushroomGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testBasicPizzaAndMushroomGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        //When
        String pizzaDescriptionWithHam = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you. + mushrooms", pizzaDescriptionWithHam);
    }

    @Test
    public void testBasicPizzaAndMushroomAndCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testBasicPizzaAndMushroomAndCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        String pizzaDescriptionWithHam = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you. + mushrooms + cheese", pizzaDescriptionWithHam);
    }

    @Test
    public void testBasicPizzaAndMushroomAndCheeseAndHamGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testBasicPizzaAndMushroomAndCheeseAndHamGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        String pizzaDescriptionWithHam = pizzaOrder.getDescription();
        //Then
        assertEquals("Regular pizza - only dough and tomato sauce for you. + mushrooms + cheese + ham", pizzaDescriptionWithHam);
    }

}

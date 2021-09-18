package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeCollectorTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test begins");
    }

    @AfterEach
    public void after() {
        System.out.println("Test ended");
    }

    @DisplayName("Add figure")
    @Test
    public void testAddFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(shape, shapeCollector.getFigure(0));
    }

    @DisplayName("Remove figure")
    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
    }
}
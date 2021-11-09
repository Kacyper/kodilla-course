package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        double add = calculator.add(6, 2);
        double sub = calculator.sub(4,1);
        double mul = calculator.mul(5, 5);
        double div = calculator.div(6, 2);

        //Then
        assertEquals(add, 8);
        assertEquals(sub, 3);
        assertEquals(mul, 25);
        assertEquals(div, 3);
    }
}

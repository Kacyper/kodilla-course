package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] numbers = new int[40];
        IntStream.range(0, numbers.length)
                .forEach(n -> numbers[n] = n + 1);

        double sum = IntStream.range(0, numbers.length)
                .map(n -> numbers[n] = n + 1)
                .sum();

        double average = sum / numbers.length;

        Assertions.assertEquals(average, ArrayOperations.getAverage(numbers));
    }
}

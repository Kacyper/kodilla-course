package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondChallangeTestSuite {

    @Test
    void probablyItWillThrowExceptionTest() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling(2, 1.2);
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(1.2, 1.9);

        //When & Then
        assertEquals(exceptionHandling.probablyIWillThrowException(), "Exception");
        assertEquals(exceptionHandling1.probablyIWillThrowException(), "Done!");
    }
}

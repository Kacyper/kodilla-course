package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoggerTestSuite {

    Logger logger;

    @Test
    void getLastLog() {
        //Given
        logger = Logger.LOGGER;
        //When
        logger.log("test");
        //Then
        assertEquals(logger.getLastLog(), "test");
    }
}

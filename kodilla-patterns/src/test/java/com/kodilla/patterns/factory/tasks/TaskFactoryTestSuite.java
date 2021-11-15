package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        assert shoppingTask != null;
        shoppingTask.executeTask();

        //Then
        assertEquals("Buying", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        assert paintingTask != null;
        paintingTask.executeTask();

        //Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        assert drivingTask != null;
        drivingTask.executeTask();

        //Then
        assertEquals("Driving", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

}

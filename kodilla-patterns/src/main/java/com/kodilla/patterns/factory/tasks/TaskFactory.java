package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "Shopping Task";
    public static final String PAINTING = "Painting Task";
    public static final String DRIVING = "Driving Task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buying", "Milk", 3);
            case PAINTING:
                return new PaintingTask("Painting", "Living Room", "Black");
            case DRIVING:
                return new DrivingTask("Driving", "Home", "Car");
            default:
                return null;
        }
    }
}

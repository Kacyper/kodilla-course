package com.kodilla.exception.test;

public class ExceptionHandling {
    private final double x;
    private final double y;

    public ExceptionHandling(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String probablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(x,y);
        } catch (Exception e) {
            System.out.println("Not working");
            return "Exception";
        } finally {
            System.out.println("it's working");
        }
    }
}

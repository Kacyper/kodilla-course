package com.kodilla.testing.calculator;

public class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 2;


        System.out.println("Wynik dodawania to: " + (a+b));
        System.out.println("Wynik odejmowania to: " + (a-b));
    }
}

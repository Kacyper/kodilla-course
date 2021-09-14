package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
       SimpleUser simpleUser = new SimpleUser("theForumUser");
       String result = simpleUser.getUsername();

       if (result.equals("theForumUser")) {
           System.out.println("test OK");
       } else {
           System.out.println("Error!");
       }
       //kolejny test jednostkowy
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int add = calculator.add(5, 2);
        int substract = calculator.subtract(5, 2);

      if   (add == 7 && substract == 4) {
            System.out.println("Kalkulator działa.");
        } else {
            System.out.println("Kalkulator jest do bani!");
        }
    }
}

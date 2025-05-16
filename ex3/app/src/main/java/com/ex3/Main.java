package com.ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Test User ==");
        User user = new User("John", "Doe", 30);
        user.displayInfo();

        System.out.println("\n== Test Recursion ==");
        int n = 5;
        Recursion recursion = new Recursion();
        System.out.println("Sum of numbers from 1 to " + n + " is: " + recursion.sumToN(n));

        System.out.println("\n== Test Time ==");
        Time time = new Time(10, 30, 45);
        time.toString();
        
    }
}

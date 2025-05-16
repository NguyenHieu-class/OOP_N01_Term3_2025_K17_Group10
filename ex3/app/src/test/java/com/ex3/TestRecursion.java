package com.ex3;

public class TestRecursion {
    public static void runTest() {
        Recursion recursion = new Recursion();
        int n = 5;
        int result = recursion.sumToN(n);
        System.out.println("Sum from 1 to " + n + " is: " + result);
    }
}
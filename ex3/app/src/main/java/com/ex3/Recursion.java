package com.ex3;

public class Recursion {
    public int sumToN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumToN(n - 1);
    }
}


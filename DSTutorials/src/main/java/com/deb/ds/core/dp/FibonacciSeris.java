package com.deb.ds.core.dp;

public class FibonacciSeris {

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
    //Bottom Up Approach
        if (n <= 1)
            return n;

        int[] store = new int[n + 1];

        store[0] = 0;
        store[1] = 1;

        for (int i = 2; i <= n; i++) {
            store[i] = store[i - 1] + store[i - 2];
        }

        return store[n];
    }
}

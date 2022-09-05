package com.devexperts.livecoding.task;

// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, ...

public class Fibonacci {
    /**
     * Returns n-th Fibonacci number
     */
    public static int calc(int n) {
        if (n <= 1) {
            return n;
        }
        return calc(n - 1) + calc(n - 2);
    }
}

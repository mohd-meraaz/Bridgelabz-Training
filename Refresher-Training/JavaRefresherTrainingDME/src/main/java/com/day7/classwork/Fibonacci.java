package com.day7.classwork;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void main() {
        int ans =  fibonacci(12);
        System.out.println(ans);
    }
}

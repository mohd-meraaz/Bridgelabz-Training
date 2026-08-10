package com.day7.hackerrank;

import java.util.Scanner;

public class _01Factorial {
    public static int factorial(int n) {
        // Write your code here
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }


    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
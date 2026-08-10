package com.day7.hackerrank;

import java.util.Scanner;

public class _02Fibonacci {
    public static int fibonacci(int n) {
        // Complete the function.
        if(n==0){
            return 0;
        }
        if( n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


     static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}

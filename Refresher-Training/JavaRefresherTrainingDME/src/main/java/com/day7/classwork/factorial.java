package com.day7.classwork;

public class factorial {
    // Method to print of any given number
    static int fatorial(int n) {
        if (n <= -1) return -1;
        if (n == 1 || n==0) return 1;
        return n * fatorial(n - 1) ;
    }


    static void main(String[] args) {
        int ans = fatorial(91);
        System.out.println(ans);
    }
}

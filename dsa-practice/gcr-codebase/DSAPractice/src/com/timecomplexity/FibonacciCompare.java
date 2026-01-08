package com.timecomplexityi;
public class FibonacciCompare {

    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibItr(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int s = a + b;
            a = b;
            b = s;
        }
        return b;
    }

    public static void main(String[] args) {

        long s1 = System.nanoTime();
        fibRec(30);
        System.out.println("Recursive: " + (System.nanoTime() - s1));

        long s2 = System.nanoTime();
        fibItr(30);
        System.out.println("Iterative: " + (System.nanoTime() - s2));
    }
}

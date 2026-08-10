package com.day7.hackerrank;

import java.util.Arrays;

public class _03DavisStaircase {
    static long[] memo;
    public static int stepPerms(int n) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return (int) solve(n);
    }

    static long solve(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (memo[n] != -1) return memo[n];

        return memo[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(stepPerms(n));
    }

}

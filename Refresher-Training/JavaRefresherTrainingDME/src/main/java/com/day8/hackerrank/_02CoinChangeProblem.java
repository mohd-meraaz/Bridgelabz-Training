package com.day8.hackerrank;

import java.util.*;
import java.util.List;

public class _02CoinChangeProblem {
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long[] dp = new long[n + 1];

        dp[0] = 1;
        for (int i = 0; i < c.size(); i++) {
            int coin = c.get(i).intValue();

            for (int j = coin; j <= n; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }
        return dp[n];
    }

     static void main() {
        int n = 4;

        List<Long> coins = Arrays.asList(1L, 2L, 3L);

        long result = getWays(n, coins);

        System.out.println(result);
    }

}

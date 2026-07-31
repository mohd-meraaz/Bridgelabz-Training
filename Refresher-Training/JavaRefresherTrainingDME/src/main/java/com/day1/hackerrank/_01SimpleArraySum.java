package com.day1.hackerrank;

import java.util.List;

public class _01SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int val : ar){
            sum+=val;
        }
        return sum;
    }
}

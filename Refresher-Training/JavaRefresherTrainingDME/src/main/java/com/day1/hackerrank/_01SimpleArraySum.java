package com.day1.hackerrank;

import java.util.ArrayList;
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

    static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        int sum =  simpleArraySum(ar);
        System.out.println(sum);
    }
}

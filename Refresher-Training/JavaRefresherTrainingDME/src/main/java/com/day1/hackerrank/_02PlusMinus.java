package com.day1.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class _02PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Assigning the variables
        float n = arr.size();
        float zero = 0;
        float positive = 0;
        float nevative = 0;
        // calculating the zeros, positives and negative values
        for (int i :arr){
            if(i==0){
                zero ++;
            }
            else if(i>=0){
                positive++;
            }
            else{
                nevative++;
            }
        }
        // printing the ratios
        System.out.println(positive/n);
        System.out.println(nevative/n);
        System.out.println(zero/n);

    }

    static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(-12);
        ar.add(-13);
        ar.add(14);
        ar.add(15);
        ar.add(0);
        ar.add(0);
        plusMinus(ar);
    }
}

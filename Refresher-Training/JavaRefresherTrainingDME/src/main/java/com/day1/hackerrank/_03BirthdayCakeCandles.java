package com.day1.hackerrank;

import java.util.List;

public class _03BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        for(int i : candles){
            if(i>max){
                max = i;
            }
        }
        int count = 0;
        for(int i : candles){
            if(i==max){
                count++;
            }
        }
        return count;
    }
}


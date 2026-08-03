package com.day2.hackerrank;

import java.util.List;

public class _02EqualStack
{
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sumh1 = sum(h1);
        int sumh2 = sum(h2);
        int sumh3 = sum(h3);

        while (true) {
            if (sumh1 == sumh2 && sumh2 == sumh3)
                return sumh1;

            if (h1.isEmpty() || h2.isEmpty() || h3.isEmpty())
                return 0;

            if (sumh1 >= sumh2 && sumh1 >= sumh3) {
                sumh1 -= h1.remove(0);
            } else if (sumh2 >= sumh1 && sumh2 >= sumh3) {
                sumh2 -= h2.remove(0);
            } else {
                sumh3 -= h3.remove(0);
            }
        }
    }
    public static int sum(List<Integer> s){
        int sum = 0;
        for(int i : s){
            sum +=i;
        }
        return sum;
    }
}

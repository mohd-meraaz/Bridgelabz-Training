package com.day7.classwork;

public class DigitSum {
    public static int digitSum(int n){
        if (n==0){
            return 0;
        }
        int lastDigit = n %10;
        int remaining = n/10;
        return lastDigit + digitSum(remaining);
    }
    public static void main(String[] args) {
        // 24 + 3
        // 2 + 4 + 3
        //=9
        int n = 243;

        System.out.println(digitSum(n));
    }
}

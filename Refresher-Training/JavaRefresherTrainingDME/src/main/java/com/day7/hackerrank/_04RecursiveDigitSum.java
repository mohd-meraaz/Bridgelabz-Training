package com.day7.hackerrank;

public class _04RecursiveDigitSum {
    public static int superDigit(String n, int k) {

        long sum = 0;

        for(char c : n.toCharArray()){
            sum += c - '0';
        }
        sum *= k;

        if(sum < 10){
            return (int) sum;
        }

        return superDigit(String.valueOf(sum), 1);
    }



    static void main() {
        String n = "13450";
        int k = 3;
        System.out.println(superDigit(n, k));
    }
}

package com.day15.hackerrank;

import java.util.Scanner;

public class _01JavaInterface {
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }

    public static class MyCalculator implements AdvancedArithmetic{
        @Override
        public int divisor_sum(int n){
            int ans =0 ;
            for(int i = 1 ; i<=n ; i++){
                if(n%i==0){
                    ans+=i;
                }
            }

            return ans;
        }
    }
     static void main() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        MyCalculator myCalculator = new MyCalculator();
        int answer = myCalculator.divisor_sum(value);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(answer);
    }
}

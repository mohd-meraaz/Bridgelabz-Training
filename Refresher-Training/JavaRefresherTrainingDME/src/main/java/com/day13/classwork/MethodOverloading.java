package com.day13.classwork;

import static com.day13.classwork.MethodOverloading.Operations.sum;

public class MethodOverloading {
    public static class Operations{
        public static int sum(int a, int b){
            return a+b;
        }
        public static int sum(int a, int b, int c){
            return a+b+c;
        }
        public static int sum(int a, int b, int c, int d){
            return a+b+c+d;
        }
    }

    static void main() {
        Operations operations = new Operations();
        int sum1 = operations.sum(1, 2, 3);
        int sum2 = operations.sum(1, 2);

        System.out.println(sum1);
        System.out.println(sum2);

    }


}

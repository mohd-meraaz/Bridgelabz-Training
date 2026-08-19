package com.day14.hackerrank;

public class _02JavaInheritanceII {
    public static class Arithmetic{
        public int sum(int a , int b){
            return a+b;
        }
    }

    public static class Adder extends Arithmetic{

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.println(adder.sum(20,22) + " " + adder.sum(6,7) + " " + adder.sum(10,10));
    }
}

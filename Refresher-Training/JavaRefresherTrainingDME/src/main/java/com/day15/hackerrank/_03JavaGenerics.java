package com.day15.hackerrank;

public class _03JavaGenerics {
    public <T> void printArray(T[] value){
        for(T t : value){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        _03JavaGenerics solution = new _03JavaGenerics();

        solution.printArray(intArray);
        solution.printArray(stringArray);


    }
}

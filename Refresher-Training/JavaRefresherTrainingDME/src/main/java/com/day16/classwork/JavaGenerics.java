package com.day16.classwork;

public class JavaGenerics {
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t+ " ");

        }
        System.out.println();
    }

    static void main() {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);

        String[] StringArr = {"A","B","C","D","E","F"};
        printArray(StringArr);
    }
}

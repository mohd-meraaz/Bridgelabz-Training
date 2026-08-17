package com.day8.classwork;

public class Subsets {
    public static void subsets(int[] arr, int index, String result) {
        if (index == arr.length) {
            System.out.println(result);
            return;
        }
        subsets(arr, index + 1, result + arr[index]);
        subsets(arr, index + 1, result);
    }

    static void main() {

    }
}

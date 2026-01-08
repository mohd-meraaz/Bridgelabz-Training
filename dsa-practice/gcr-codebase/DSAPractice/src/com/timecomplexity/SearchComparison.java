package com.timecomplexity;


import java.util.*;

public class SearchComparison {

    public static void main(String[] args) {

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        int target = 99999;

        linearSearch(arr, target);
        binarySearch(arr, target);
    }

    static void linearSearch(int[] arr, int target) {
        long start = System.nanoTime();
        for (int x : arr)
            if (x == target) break;
        System.out.println("Linear: " + (System.nanoTime() - start));
    }

    static void binarySearch(int[] arr, int target) {
        long start = System.nanoTime();
        Arrays.binarySearch(arr, target);
        System.out.println("Binary: " + (System.nanoTime() - start));
    }
}

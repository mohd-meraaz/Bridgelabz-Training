package com.timecomplexity;

import java.util.*;

public class SortingComparison {

    // Bubble sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    // Merge sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = new Random().ints(1000, 1, 10000).toArray();

        int[] a1 = arr.clone();
        int[] a2 = arr.clone();
        int[] a3 = arr.clone();

        long s1 = System.nanoTime();
        bubbleSort(a1);
        System.out.println("Bubble: " + (System.nanoTime() - s1));

        long s2 = System.nanoTime();
        mergeSort(a2, 0, a2.length - 1);
        System.out.println("Merge: " + (System.nanoTime() - s2));

        long s3 = System.nanoTime();
        quickSort(a3, 0, a3.length - 1);
        System.out.println("Quick: " + (System.nanoTime() - s3));
    }
}

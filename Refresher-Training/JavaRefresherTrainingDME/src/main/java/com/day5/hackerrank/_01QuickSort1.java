package com.day5.hackerrank;

import java.util.List;

public class _01QuickSort1 {
    public static void swap(List<Integer> arr , int i , int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }


    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int low = 0;
        int high = arr.size()-1;
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);

        return arr;

    }
}

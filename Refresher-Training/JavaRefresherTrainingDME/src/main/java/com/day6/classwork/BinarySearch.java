package com.day6.classwork;

public class BinarySearch {
    static int binarySearchRecursice(int[] arr, int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return binarySearchRecursice(arr, low, mid - 1, key);
        }
        return binarySearchRecursice(arr, mid + 1, high, key);
    }

    static int binarySearchIterative(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = binarySearchRecursice(arr, 0, arr.length - 1, 10);
        if(ans == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println(ans);
        }
    }
}

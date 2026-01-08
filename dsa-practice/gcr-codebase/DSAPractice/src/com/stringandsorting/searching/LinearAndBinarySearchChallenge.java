package com.stringandsorting.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search part
        int missing = firstMissingPositive(arr.clone());
        System.out.println("First missing positive integer: " + missing);

        // Binary Search part
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int index = binarySearchIndex(arr, target);
        System.out.println("Target index after sorting: " + index);

        sc.close();
    }

    // --------------------------------------------------
    // PART 1: Linear Search - First Missing Positive
    // --------------------------------------------------
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;

        // Mark visited numbers
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Find first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    // --------------------------------------------------
    // PART 2: Binary Search for Target Index
    // --------------------------------------------------
    public static int binarySearchIndex(int[] arr, int target) {

        Arrays.sort(arr); // required for binary search

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

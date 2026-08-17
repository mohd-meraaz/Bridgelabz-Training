package com.day6.classwork;

public class OccurancesUsingBS {
    static int countLeftOccurances(int[] arr, int low, int high, int key){
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                index = mid;
                high = mid - 1;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return index;

    }
    static int countRightOccurances(int[] arr, int low, int high, int key){
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                index = mid;
                low = mid + 1;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return index;

    }

    static void main() {
        int[] arr = {1, 2, 4, 4, 4, 4, 7, 8, 9, 10};
        int low = 0;
        int high = arr.length - 1;
        int key = 4;
        int leftCount = countLeftOccurances(arr, low, high, key);
        int RightCount = countRightOccurances(arr, low, high, key);
        int occurances =  RightCount - leftCount + 1;
        System.out.println(occurances);
    }
}

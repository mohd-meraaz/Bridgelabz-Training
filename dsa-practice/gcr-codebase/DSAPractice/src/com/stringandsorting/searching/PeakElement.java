package com.stringandsorting.searching;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 20, 4, 1, 0 };

        int index = findPeakElement(arr);

        System.out.println("Peak element index: " + index);
        System.out.println("Peak element value: " + arr[index]);
    }

    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean leftOK = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightOK = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];

            if (leftOK && rightOK) {
                return mid; // peak found
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1; // move left
            } else {
                left = mid + 1; // move right
            }
        }
        return -1; // should never happen
    }
}

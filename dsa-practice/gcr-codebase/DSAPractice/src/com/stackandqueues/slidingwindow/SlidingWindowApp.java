package com.stackandqueues.slidingwindow;

public class SlidingWindowApp {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMaximum sw = new SlidingWindowMaximum();
        sw.findMaximum(arr, k);
    }
}

package com.day6.classwork;

public class LinearSearch {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = linearSearch(arr,7);
        if(ans == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println(ans);
        }


    }
}

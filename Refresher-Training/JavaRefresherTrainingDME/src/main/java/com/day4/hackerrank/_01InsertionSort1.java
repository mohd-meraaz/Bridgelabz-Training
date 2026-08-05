package com.day4.hackerrank;

import java.util.*;


public class _01InsertionSort1 {
    public static void insertionSort1(int n, List<Integer> arr) {

        int key = arr.get(n - 1);
        int j = n - 2;

        while (j >= 0 && arr.get(j) > key) {
            arr.set(j + 1, arr.get(j));

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            j--;
        }

        arr.set(j + 1, key);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List <Integer> arrList = new ArrayList<>();
        for (int a: arr){
            arrList.add(a);
        }
        insertionSort1(n, arrList);
    }
}

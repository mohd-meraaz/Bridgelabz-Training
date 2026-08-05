package com.day4.hackerrank;

import java.util.*;

public class _03CorrectnessAndLoopVarient {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);


        }
        // Print the array after each iteration
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arrList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arrList.add(sc.nextInt());
        }

        insertionSort2(n, arrList);
        sc.close();
    }
}

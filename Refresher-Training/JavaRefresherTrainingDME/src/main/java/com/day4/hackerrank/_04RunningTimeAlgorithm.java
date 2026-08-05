package com.day4.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04RunningTimeAlgorithm {
    public static void insertionSort(int n, List<Integer> arr) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                counter++;
                j--;
            }

            arr.set(j + 1, key);


        }

        System.out.println(counter);
    }
     static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arrList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arrList.add(sc.nextInt());
        }

        insertionSort(n, arrList);
        sc.close();
    }
}

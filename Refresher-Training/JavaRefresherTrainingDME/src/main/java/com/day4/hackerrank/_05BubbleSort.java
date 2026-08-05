package com.day4.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05BubbleSort {
    public static void countSwaps(List<Integer> a) {
        int n = a.size();
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arrList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arrList.add(sc.nextInt());
        }

        countSwaps( arrList);
        sc.close();
    }
}

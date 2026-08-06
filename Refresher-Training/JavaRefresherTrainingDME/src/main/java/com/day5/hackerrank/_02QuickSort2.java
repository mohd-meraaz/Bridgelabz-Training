package com.day5.hackerrank;
import java.io.*;
import java.util.*;
public class _02QuickSort2
{
        static void quickSort(int[] arr, int low, int high) {

            if (low >= high)
                return;

            int pivot = arr[low];

            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            for (int i = low + 1; i <= high; i++) {
                if (arr[i] < pivot)
                    left.add(arr[i]);
                else
                    right.add(arr[i]);
            }

            int index = low;

            for (int x : left)
                arr[index++] = x;

            int pivotIndex = index;
            arr[index++] = pivot;

            for (int x : right)
                arr[index++] = x;

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

            for (int i = low; i <= high; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            quickSort(arr, 0, n - 1);
        }
    }


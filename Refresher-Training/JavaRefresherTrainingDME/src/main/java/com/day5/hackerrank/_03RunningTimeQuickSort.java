package com.day5.hackerrank;

import java.io.*;
import java.util.*;

public class _03RunningTimeQuickSort {


        static int quickSwapCounter = 0;
        public static int  insertionSort(int[] arr) {
            int count = 0;
            for (int i = 1; i < arr.length; i++) {

                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    count++;
                    j--;
                }

                arr[j + 1] = key;
            }
            return count;
        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            quickSwapCounter++;
        }

        static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

            swap(arr, i + 1, high);
            return i + 1;
        }
        public static  void qs(int[] nums, int low, int high) {

            if (low < high) {
                int pIndex = partition(nums, low, high);
                qs(nums, low, pIndex - 1);
                qs(nums, pIndex + 1, high);
            }
        }

        public static void quickSort(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            qs(nums, low, high);

        }


        static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int [] arr = new int [n];

            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int [] arr2 = arr.clone();
            int insertionCount = insertionSort(arr);
            quickSort(arr2);
            System.out.print(insertionCount - quickSwapCounter);

        }
    }
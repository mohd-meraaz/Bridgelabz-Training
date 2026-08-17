package com.day5.classwork;

public class QuickSort {

        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public int quickSortHelper(int arr[], int low, int high) {
            int pivot = arr[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (arr[i] <= pivot && i <= high - 1) {
                    i++;
                }
                while (arr[j] > pivot && j >= low + 1) {
                    j--;
                }
                if (i < j) {
                    swap(arr, i, j);
                }
            }
            swap(arr, low, j);
            return j;
        }

        public void qs(int[] nums, int low, int high) {

            if (low < high) {
                int pIndex = quickSortHelper(nums, low, high);
                qs(nums, low, pIndex - 1);
                qs(nums, pIndex + 1, high);
            }
        }

        public int[] quickSort(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            qs(nums, low, high);
            return nums;
        }
        void main(){
            int [] arr = {23,32, 34, 5 ,45, 34,54 ,2 ,5,6 ,34};
            quickSort(arr);
            for(int i : arr){
                System.out.print(i+" ");
            }
        }
    }

package com.sorting.zipzipmart;

public class SalesMergeSort {

    public static void mergeSort(SalesTransaction[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Divide
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Conquer
            merge(arr, left, mid, right);
        }
    }

    private static void merge(
            SalesTransaction[] arr,
            int left,
            int mid,
            int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesTransaction[] L = new SalesTransaction[n1];
        SalesTransaction[] R = new SalesTransaction[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge two sorted arrays
        while (i < n1 && j < n2) {

            if (compare(L[i], R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Custom comparison logic
    private static int compare(SalesTransaction a, SalesTransaction b) {

        int dateCompare = a.getDate().compareTo(b.getDate());

        if (dateCompare != 0)
            return dateCompare;

        return Double.compare(a.getAmount(), b.getAmount());
    }
}

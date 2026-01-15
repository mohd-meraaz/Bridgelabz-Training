package com.sorting.zipzipmart;

public class ZipZipMartApp {

    public static void main(String[] args) {

        SalesTransaction[] transactions = {
            new SalesTransaction(101, "2024-09-10", 2500),
            new SalesTransaction(102, "2024-09-08", 1200),
            new SalesTransaction(103, "2024-09-10", 1800),
            new SalesTransaction(104, "2024-09-09", 500),
            new SalesTransaction(105, "2024-09-08", 900)
        };

        System.out.println("Before Sorting:");
        for (SalesTransaction t : transactions)
            t.display();

        SalesMergeSort.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        for (SalesTransaction t : transactions)
            t.display();
    }
}

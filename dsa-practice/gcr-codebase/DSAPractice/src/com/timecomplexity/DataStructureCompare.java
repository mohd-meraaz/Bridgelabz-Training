package com.timecomplexity;
import java.util.*;

public class DataStructureCompare {

    public static void main(String[] args) {

        int n = 100000;
        int target = n - 1;

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            set.add(i);
            tree.add(i);
        }

        long s1 = System.nanoTime();
        for (int x : arr)
            if (x == target) break;
        System.out.println("Array: " + (System.nanoTime() - s1));

        long s2 = System.nanoTime();
        set.contains(target);
        System.out.println("HashSet: " + (System.nanoTime() - s2));

        long s3 = System.nanoTime();
        tree.contains(target);
        System.out.println("TreeSet: " + (System.nanoTime() - s3));
    }
}

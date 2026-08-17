package com.day8.classwork;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {
    public static void generatePermutation(int[] arr, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            current.add(arr[i]);
            generatePermutation(arr, used, current, result);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

     static void main() {
        int arr[] = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        generatePermutation(arr, new boolean[arr.length], new ArrayList<>(), result);

        for (List<Integer> possibility : result) {
            System.out.println(possibility);
        }
    }
}
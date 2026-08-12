package com.day8.hackerrank;

import java.util.*;

public class _01NextPermutation {
    public static void permute(List<String> arr) {

        // Sort the array so permutations are generated in lexicographical order
        Collections.sort(arr);

        // Start recursion from index 0
        generate(arr, 0);
    }

    // Recursive function to generate permutations
    private static void generate(List<String> arr, int index) {

        // Base Case:
        // If every position is fixed, print the permutation
        if (index == arr.size()) {

            for (int i = 0; i < arr.size(); i++) {

                System.out.print(arr.get(i));

                if (i != arr.size() - 1)
                    System.out.print(" ");
            }

            System.out.println();
            return;
        }

        // Used to avoid duplicate permutations
        HashSet<String> used = new HashSet<>();

        // Try every element for the current position
        for (int i = index; i < arr.size(); i++) {

            // Skip duplicates at the same recursion level
            if (used.contains(arr.get(i)))
                continue;

            used.add(arr.get(i));

            // Swap current element with current index
            Collections.swap(arr, index, i);

            // Recur for the next position
            generate(arr, index + 1);

            // Backtrack
            Collections.swap(arr, index, i);
        }
    }
}

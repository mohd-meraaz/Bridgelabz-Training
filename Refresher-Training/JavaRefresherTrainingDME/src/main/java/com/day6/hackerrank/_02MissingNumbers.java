package com.day6.hackerrank;
import java.util.*;

public class _02MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (j < brr.size()) {

            if (i < arr.size() && arr.get(i).equals(brr.get(j))) {
                i++;
                j++;
            } else {
                if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(brr.get(j))) {
                    ans.add(brr.get(j));
                }
                j++;
            }
        }

        return ans;
    }
}

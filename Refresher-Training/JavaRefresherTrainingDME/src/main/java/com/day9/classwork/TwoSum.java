package com.day9.classwork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    static void twoSumSet(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println((target - num) + " " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No pair found");
    }
    static int[] twoSumMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{complement, arr[i]};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,34 ,45,3 , 4, 6};
        int target = 10;
        int ans[] = twoSumMap(arr, target);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

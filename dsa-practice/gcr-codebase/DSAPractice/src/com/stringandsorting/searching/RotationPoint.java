package com.stringandsorting.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element: ");
            arr.add(sc.nextInt());
        }

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr.get(index));

        sc.close();
    }

    public static int findRotationPoint(ArrayList<Integer> arr) {

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr.get(mid) > arr.get(right)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

package com.day1.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class _06LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> rotatedArray = new ArrayList<Integer>() ;
        for(int i = d ; i<a.size(); i++){
            rotatedArray.add(a.get(i));
        }
        for(int i = 0 ; i<d; i++){
            rotatedArray.add(a.get(i));
        }
        return rotatedArray;
    }
}

package com.day1.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class _05ArraysDS {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reversedArray = new ArrayList<Integer>() ;
        for(int i =a.size()-1 ; i>=0;i-- ){
            reversedArray.add(a.get(i));
        }
        return reversedArray;
    }
}

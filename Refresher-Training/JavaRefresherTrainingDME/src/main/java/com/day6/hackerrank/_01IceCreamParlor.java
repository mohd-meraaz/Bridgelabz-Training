package com.day6.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class _01IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {

                if (arr.get(i) + arr.get(j) == m) {
                    answer.add(i + 1);
                    answer.add(j + 1);
                    return answer;
                }
            }
        }

        return answer;
    }
}

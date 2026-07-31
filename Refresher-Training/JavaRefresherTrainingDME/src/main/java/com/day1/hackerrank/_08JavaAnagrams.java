package com.day1.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _08JavaAnagrams {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next().trim();
        String s2 = sc.next().trim();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        s1 = new String(s1Array);
        s2 = new String(s2Array);

        if (s1.equals(s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

package com.day1.hackerrank;

public class _04CamelCase {
    public static int camelcase(String s) {
        // Write your code here
        int count = 1 ;
        for(int i = 0 ; i<s.length();i++ ){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                count ++;
            }
        }
        return count;
    }
}

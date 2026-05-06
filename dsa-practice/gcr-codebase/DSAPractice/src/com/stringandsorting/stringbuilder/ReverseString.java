package com.stringandsorting.stringbuilder;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a String : ");
        String input = sc.nextLine().trim();

        // Convert to StringBuilder
        StringBuilder inputString = new StringBuilder(input);

        // Reverse the string

        StringBuilder outputString = reverseString(inputString);

        // Output result
        System.out.println(outputString);

        sc.close();
    }

    private static StringBuilder reverseString(StringBuilder inputString) {

        StringBuilder reversedString = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }

        return reversedString;
    }

}

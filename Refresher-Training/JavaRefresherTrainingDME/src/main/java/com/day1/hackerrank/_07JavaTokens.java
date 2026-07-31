package com.day1.hackerrank;

import java.util.Scanner;

public class _07JavaTokens {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc = new Scanner (System.in);
        String text = Sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = text.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        Sc.close();
    }
}

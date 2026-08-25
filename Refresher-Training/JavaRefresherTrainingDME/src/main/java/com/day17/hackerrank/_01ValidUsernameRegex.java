package com.day17.hackerrank;

import java.util.Scanner;

public class _01ValidUsernameRegex {
     static void main() {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Sc.nextLine();
        for(int i = 0 ; i<n  ; i++){
            String st = Sc.nextLine();

            String regex = "[a-zA-Z][a-zA-Z0-9_]{7,29}";

            if(st.matches(regex)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }

        }
    }
}

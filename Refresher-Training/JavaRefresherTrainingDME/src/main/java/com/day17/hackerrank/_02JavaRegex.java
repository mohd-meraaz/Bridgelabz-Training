package com.day17.hackerrank;

import java.util.Scanner;

public class _02JavaRegex {
      static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {

    String number = "(\\d|\\d\\d|[01]\\d\\d|2[0-4]\\d|25[0-5])";

    String pattern = number + "\\." +
            number + "\\." +
            number + "\\." +
            number;
}

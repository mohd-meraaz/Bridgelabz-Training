package com.day11.hackerrank;

public class _01TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String[] st = s.split(":");

        int hour = Integer.parseInt(st[0]);
        int minute = Integer.parseInt(st[1]);
        int second = Integer.parseInt(st[2].substring(0, 2));
        String period = st[2].substring(2);

        if (period.equals("AM") && hour == 12) {
            hour = 0;
        } else if (period.equals("PM") && hour != 12) {
            hour += 12;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

     static void main(String[] args) {
        String input = "07:05:45PM";
        System.out.println(timeConversion(input));
    }
}

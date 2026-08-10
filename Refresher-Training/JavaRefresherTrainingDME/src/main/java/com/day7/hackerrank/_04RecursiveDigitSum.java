package com.day7.hackerrank;

public class _04RecursiveDigitSum {
    public static int superDigit(String n, int k) {

        int value = Integer.parseInt(n);

        int a = digitSum(value);

        int answer = a * k;

        if (answer < 10) {
            return answer;
        } else {
            return superDigit(String.valueOf(answer), 1);
        }
    }

    public static int digitSum(int n) {

        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        int remaining = n / 10;

        return lastDigit + digitSum(remaining);
    }

    static void main() {
        String n = "13450";
        int k = 3;
        System.out.println(superDigit(n, k));
    }
}

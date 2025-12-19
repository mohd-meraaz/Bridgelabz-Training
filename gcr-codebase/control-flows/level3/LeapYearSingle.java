// Java program to check leap year using single-line condition

import java.util.Scanner;

public class LeapYearSingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking year input
        int year = sc.nextInt();

        // Checking Gregorian calendar condition
        if (year > 1581) {

            // Single-line leap year condition
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

        } else {
            System.out.println("You have entered a year before Gregorian calendar.");
        }

        sc.close();
    }
}

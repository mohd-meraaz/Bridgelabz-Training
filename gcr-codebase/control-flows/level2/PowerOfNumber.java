// Java program to find the power of a number.

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        // Creating a scanner 
        Scanner input = new Scanner(System.in);

        // Get input values ans storing it
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check for positive integers
        if (number > 0 && power > 0) {

            int result = 1;

            // for loop to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print result
            System.out.println("Result: " + result);

        } else {
            System.out.println("Please enter positive integers only.");
        }

        input.close();
    }
}

// Java program to find all the multiples of a number taken as user input below 100.

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        // Creating scanner 
        Scanner input = new Scanner(System.in);

        // Taking user input of a number and storing it
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}



import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

    	// creating Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number > 0) {
            int i = 1; // initialization

            // while loop
            while (i <= number) {
            	// Checking for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " FizzBuzz");
                } 
                // Checking for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println(i + " Fizz");
                } 
                // Checking for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                } 
                

                i++; // increment
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}

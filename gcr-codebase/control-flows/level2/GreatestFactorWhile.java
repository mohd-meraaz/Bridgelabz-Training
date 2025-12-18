// java program to print the greatest factor of a number beside itself using a while loop.

import java.util.Scanner;

public class GreatestFactorWhile
 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Creating varible to store greatestFactor
        int greatestFactor = 1;

        // Initialize counter
        int counter = number - 1;

        // while loop from number to 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; 
            }
            counter--;
        }

        // Display the result
        System.out.println("Greatest factor (besides itself): " + greatestFactor);

        input.close();
    }
}

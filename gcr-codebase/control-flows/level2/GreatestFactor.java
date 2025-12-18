// Java program to print the greatest factor of a number 
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = Sc.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Loop from number to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; 
            }
        }

        // Display the result
        System.out.println("Greatest factor (besides itself): " + greatestFactor);

        Sc.close();
    }
}

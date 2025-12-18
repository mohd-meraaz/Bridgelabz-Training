// java program to find the power of a number using while loop
import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input values ans storing it
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        int result = 1;      
        int counter = 0;     

        // while loop till counter equals power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Print the result
        System.out.println("Result: " + result);

        input.close();
    }
}

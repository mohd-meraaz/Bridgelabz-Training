import java.util.Scanner;

public class FindMultiples {
    public static void main(String[] args) {

        // Creating scanner 
        Scanner input = new Scanner(System.in);

        // Getting input and storing the value
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            // Initialize 
            int i = 100;

            // while loop from 100 to 1
            while (i >= 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        // Closing Scanner
        input.close();
    }
}

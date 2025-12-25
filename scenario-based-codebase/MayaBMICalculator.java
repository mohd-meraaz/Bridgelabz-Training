import java.util.Scanner;

public class MayaBMICalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user for height in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Ask user for weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculate BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        // Close the scanner
        scanner.close();
    }
}

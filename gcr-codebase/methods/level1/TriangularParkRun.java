// Java program to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input of all the sides
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calling method 
        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds needed to complete 5 km: " + rounds);

        sc.close();
    }
}

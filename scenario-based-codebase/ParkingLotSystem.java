import java.util.Scanner;

public class ParkingLotSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = 50;          // Maximum parking capacity
        int parkedCars = 0;        // Current parked cars
        int choice;

        // Continue until parking is full or user exits
        while (parkedCars < capacity) {

            // Display menu
            System.out.println("1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            // Switch-case for menu handling
            switch (choice) {

                case 1:
                    // Park a car if space is available
                    if (parkedCars < capacity) {
                        parkedCars++;
                        System.out.println("Car parked successfully.");
                    }
                    break;

                case 2:
                    // Exit a car if parking is not empty
                    if (parkedCars > 0) {
                        parkedCars--;
                        System.out.println("Car exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty.");
                    }
                    break;

                case 3:
                    // Show current occupancy
                    System.out.println("Cars parked: " + parkedCars + "/" + capacity);
                    break;

                case 4:
                    // Exit the system
                    System.out.println("Exiting parking system.");
                    scanner.close();
                    return;

                default:
                    // Invalid menu option
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("--------------------------------");
        }

        // Parking full message
        System.out.println("Parking lot is full.");
        scanner.close();
    }
}

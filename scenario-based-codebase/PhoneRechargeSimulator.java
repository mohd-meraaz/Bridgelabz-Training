import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        double balance = 0;     // Stores total recharge balance
        String operator;        // Stores mobile operator name

        // Loop to allow repeated recharges
        while (true) {

            // Ask user for mobile operator
            System.out.print("Enter mobile operator (Jio/Airtel/VI) or exit: ");
            operator = scanner.nextLine();

            // Exit condition
            if (operator.equalsIgnoreCase("exit")) {
                break;
            }

            // Take mobile number (use long for safety)
            System.out.print("Enter mobile number: ");
            long mobileNumber = scanner.nextLong();
            scanner.nextLine(); // Consume leftover newline

            // Take recharge amount
            System.out.print("Enter recharge amount: ₹");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume leftover newline

            // Display offers based on operator using switch-case
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Offer: 1.5GB/day for 28 days");
                    break;
                case "airtel":
                    System.out.println("Offer: Unlimited calls + 2GB/day");
                    break;
                case "vi":
                    System.out.println("Offer: Weekend data rollover");
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue; // Skip recharge if operator is invalid
            }

            // Update balance after successful recharge
            balance += amount;

            // Display recharge confirmation
            System.out.println("Recharge successful on " + mobileNumber);
            System.out.println("Current Balance: ₹" + balance);
            System.out.println("--------------------------------");
        }

        // Close scanner
        scanner.close();
        System.out.println("Thank you for using the recharge simulator.");
    }
}

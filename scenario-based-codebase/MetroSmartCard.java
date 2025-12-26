import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ₹");
        double balance = scanner.nextDouble();

        while (balance > 0) {

            System.out.print("Enter travel distance in km (or -1 to quit): ");
            int distance = scanner.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 10) ? 20 : 30;

            // Check sufficient balance
            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            System.out.println("--------------------------------");
        }

        System.out.println("Thank you for using Delhi Metro Smart Card.");
        scanner.close();
    }
}

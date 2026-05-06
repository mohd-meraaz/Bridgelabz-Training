import java.util.Scanner;

public class CurrencyExchangeKiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            int currency = sc.nextInt();

            switch (currency) {
                case 1:
                    System.out.println("USD: " + (inr * 0.012));
                    break;
                case 2:
                    System.out.println("EUR: " + (inr * 0.011));
                    break;
                case 3:
                    System.out.println("GBP: " + (inr * 0.010));
                    break;
                default:
                    System.out.println("Invalid currency choice");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}

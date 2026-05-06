import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffeeType;

        while (true) {
            System.out.print("Enter coffee type (espresso/latte/cappuccino) or 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double price = 0;

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * 0.05;
            double finalBill = total + gst;

            System.out.println("-----------------------------------------");
            System.out.println("Total bill (including GST): ₹" + finalBill);
            System.out.println("-----------------------------------------");
        }

        sc.close();
    }
}

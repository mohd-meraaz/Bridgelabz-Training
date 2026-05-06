import java.util.Scanner;

public class ShopkeeperDiscount {

    // Constants for discount rates
    static final double DISCOUNT_10 = 0.10;
    static final double DISCOUNT_20 = 0.20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalBill = 0;
        int numberOfItems = 5;

        // Input item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            totalBill += scanner.nextDouble();
        }

        double discount;

        // Apply discount based on total bill
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 2000) {
            discount = totalBill * DISCOUNT_10;
        } else {
            discount = 0;
        }

        double finalAmount = totalBill - discount;

        // Display bill summary
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Amount Payable: ₹" + finalAmount);

        scanner.close();
    }
}

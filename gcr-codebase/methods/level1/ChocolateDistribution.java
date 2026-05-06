import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // chocolates per child
        int remainder = number % divisor;  // remaining chocolates

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}

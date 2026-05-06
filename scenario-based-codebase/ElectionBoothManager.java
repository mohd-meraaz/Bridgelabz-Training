import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.print("Vote (1-Candidate1, 2-Candidate2, 3-Candidate3): ");
                int vote = scanner.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                } else if (vote == 2) {
                    candidate2Votes++;
                } else if (vote == 3) {
                    candidate3Votes++;
                } else {
                    System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote");
            }

            System.out.println("--------------------------------");
        }

        // Display final results
        System.out.println("Election Results:");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        scanner.close();
    }
}

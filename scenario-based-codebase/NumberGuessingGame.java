import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        // Game loop runs at least once
        do {
            System.out.print("Guess the number (1 to 100): ");
            guess = scanner.nextInt();
            attempts++;

            // Check guess
            if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break;
            }

        } while (attempts < maxAttempts);

        // If attempts are exhausted
        if (guess != numberToGuess) {
            System.out.println("Game over! The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}

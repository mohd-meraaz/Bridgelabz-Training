package com.bridgelabz.edumentor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Learner learner = new Learner(
                "Ayaan",
                "ayaan@edumentor.com",
                "L101",
                "short"
        );

        Quiz quiz = null;
        int choice;

        do {
            System.out.println("\n=== EduMentor Menu ===");
            System.out.println("1. Start Easy Quiz");
            System.out.println("2. Start Hard Quiz");
            System.out.println("3. View Result");
            System.out.println("4. Generate Certificate");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    quiz = new Quiz("easy");
                    quiz.conductQuiz(sc);
                    break;

                case 2:
                    quiz = new Quiz("hard");
                    quiz.conductQuiz(sc);
                    break;

                case 3:
                    if (quiz != null)
                        quiz.showResult();
                    else
                        System.out.println("No quiz attempted yet.");
                    break;

                case 4:
                    learner.generateCertificate();
                    break;

                case 0:
                    System.out.println("Exiting EduMentor...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}

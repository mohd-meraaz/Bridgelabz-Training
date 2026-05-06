// 17. Online Quiz Application 🧠
// Ask 5 questions (MCQs) from a user.
// ● Use arrays and for-loop.
// ● Record score.
// ● Switch for answer checking. Apply clear indentation and structured layout.

import java.util.Scanner;

public class OnlineQuiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "1. Which language is platform independent?\nA. C\nB. Java\nC. C++\nD. Python",
            "2. Which keyword is used to inherit a class?\nA. this\nB. super\nC. extends\nD. implements",
            "3. Which loop is entry-controlled?\nA. do-while\nB. while\nC. for\nD. All of the above",
            "4. Which data type is used to store decimal values?\nA. int\nB. char\nC. double\nD. boolean",
            "5. Which concept allows method overloading?\nA. Inheritance\nB. Polymorphism\nC. Encapsulation\nD. Abstraction"
        };

        char[] answers = {'B', 'C', 'D', 'C', 'B'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.println("-----------------------------");
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }
}

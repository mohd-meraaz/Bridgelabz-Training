package com.bridgelabz.edumentor;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<Question> questionBank; // must remain private
    private int score;

    // Difficulty-based constructor
    public Quiz(String difficulty) {
        questionBank = new ArrayList<>();
        score = 0;

        if (difficulty.equalsIgnoreCase("easy")) {
            loadEasyQuestions();
        } else {
            loadHardQuestions();
        }
    }

    // Internal question loading (ENCAPSULATED)
    private void loadEasyQuestions() {
        questionBank.add(
            new Question(
                "What is 2 + 2 ?",
                List.of("3", "4", "5", "6"),
                1
            )
        );
    }

    private void loadHardQuestions() {
        questionBank.add(
            new Question(
                "What is 12 × 8 ?",
                List.of("96", "88", "108", "86"),
                0
            )
        );
    }

    // Conduct quiz (MCQ)
    public void conductQuiz(java.util.Scanner sc) {
        score = 0;

        for (Question q : questionBank) {
            q.displayQuestion();
            System.out.print("Enter option (A/B/C/D): ");
            char choice = sc.next().toUpperCase().charAt(0);

            int selectedIndex = choice - 'A';

            if (q.isCorrect(selectedIndex)) {
                score++; // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / questionBank.size();
    }

    public void showResult() {
        System.out.println("\nScore      : " + score);
        System.out.println("Percentage : " + calculatePercentage() + "%");
    }
}

package com.bridgelabz.edumentor;

import java.util.List;

public class Question {

    private String questionText;
    private List<String> options;
    private int correctOption; // index (0–3)

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        char optionLabel = 'A';
        for (String opt : options) {
            System.out.println(optionLabel + ". " + opt);
            optionLabel++;
        }
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOption;
    }
}

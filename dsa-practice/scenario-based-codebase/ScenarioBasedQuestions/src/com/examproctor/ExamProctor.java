package com.examproctor;

import java.util.*;

class ExamProctor {
    private Stack<Integer> navigationStack = new Stack<>();
    private Map<Integer, String> answerMap = new HashMap<>();
    private Map<Integer, String> correctAnswers = new HashMap<>();

    // Load correct answers
    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // Navigate to question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store or update answer
    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    // Review last visited question
    public void reviewLastQuestion() {
        if (navigationStack.isEmpty()) {
            System.out.println("No questions visited");
            return;
        }
        System.out.println("Last visited question: " + navigationStack.peek());
    }

    // Function to calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : answerMap.keySet()) {
            if (answerMap.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}

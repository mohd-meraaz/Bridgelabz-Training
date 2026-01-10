package com.bridgelabz.skillforge;

public class Student extends User {
    private int progress;   // percentage
    private int score;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operators
    }

    public void assignScore(int score) {
        this.score = score;
    }

    public int getProgress() {
        return progress;
    }

    public int getScore() {
        return score;
    }
}

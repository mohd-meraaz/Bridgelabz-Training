package com.day14.hackerrank;

import java.util.*;

public class _03JavaInheritance {
    public class Student {

        private String firstName;
        private String lastName;
        private int idNumber;
        private List<Integer> scores;

        Student(String firstName, String lastName, int idNumber, List<Integer> scores) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.scores = scores;
        }

        public char calculate() {

            int total = 0;

            for (int i : scores) {
                total += i;
            }

            int average = total / scores.size();

            if (average >= 90) {
                return 'O';
            } else if (average >= 80) {
                return 'E';
            } else if (average >= 70) {
                return 'A';
            } else if (average >= 55) {
                return 'P';
            } else if (average >= 40) {
                return 'D';
            } else {
                return 'T';
            }
        }

        public void display() {
            System.out.println("Name: " + lastName + ", " + firstName);
            System.out.println("ID: " + idNumber);
            System.out.println("Grade: " + calculate());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read first name, last name and ID
        String firstName = sc.next();
        String lastName = sc.next();
        int idNumber = sc.nextInt();

        // Number of scores
        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        _03JavaInheritance solution = new _03JavaInheritance();

        Student student = solution.new Student(
                firstName,
                lastName,
                idNumber,
                scores
        );

        // Display result
        student.display();

        sc.close();
    }
}

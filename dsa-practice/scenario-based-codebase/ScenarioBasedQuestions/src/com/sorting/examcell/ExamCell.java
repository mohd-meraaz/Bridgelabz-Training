package com.sorting.examcell;

public class ExamCell {

    public static void main(String[] args) {

        Exam[] examRecords = {
            new Exam("Allu", 1, 655),
            new Exam("Ravi", 4, 535),
            new Exam("Kali", 56, 411),
            new Exam("Suriya", 14, 545),
            new Exam("Sonu", 41, 455)
        };

        Exam[] sortedResults =
                ExamSorter.sortByRank(examRecords, 0, examRecords.length - 1);

        System.out.println("Rank\tName\t\tScore");
        for (Exam exam : sortedResults) {
            System.out.println(
                exam.studentRank + "\t" +
                exam.studentName + "\t\t" +
                exam.studentScore
            );
        }
    }
}

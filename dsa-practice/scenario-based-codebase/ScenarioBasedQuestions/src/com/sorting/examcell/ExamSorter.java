package com.sorting.examcell;

public class ExamSorter {

    // Public method to start merge sort
    public static Exam[] sortByRank(Exam[] examRecords, int start, int end) {

        if (start == end) {
            return new Exam[]{examRecords[start]};
        }

        int midIndex = (start + end) / 2;

        Exam[] leftHalf = sortByRank(examRecords, start, midIndex);
        Exam[] rightHalf = sortByRank(examRecords, midIndex + 1, end);

        return mergeSortedLists(leftHalf, rightHalf);
    }

    // Merge two sorted arrays
    private static Exam[] mergeSortedLists(Exam[] leftList, Exam[] rightList) {

        Exam[] mergedResult = new Exam[leftList.length + rightList.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultIndex = 0;

        while (leftPointer < leftList.length && rightPointer < rightList.length) {

            if (leftList[leftPointer].studentRank < rightList[rightPointer].studentRank) {
                mergedResult[resultIndex++] = leftList[leftPointer++];
            } else {
                mergedResult[resultIndex++] = rightList[rightPointer++];
            }
        }

        while (leftPointer < leftList.length) {
            mergedResult[resultIndex++] = leftList[leftPointer++];
        }

        while (rightPointer < rightList.length) {
            mergedResult[resultIndex++] = rightList[rightPointer++];
        }

        return mergedResult;
    }
}

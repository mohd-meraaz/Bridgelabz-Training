package com.sorting.hospitalqueue;

public class HospitalQueue {

	// method to sort patients by Criticality using bubble sort algorithm
    public static void bubbleSortByCriticality(Patient[] patients) {

        int n = patients.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Sort DESCENDING (higher criticality first)
                if (patients[j].getCriticalityLevel() <
                    patients[j + 1].getCriticalityLevel()) {

                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }
}


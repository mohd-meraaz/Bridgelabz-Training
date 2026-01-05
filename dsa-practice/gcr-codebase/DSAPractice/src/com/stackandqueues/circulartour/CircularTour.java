package com.stackandqueues.circulartour;

public class CircularTour {

    public int findStartPoint(int[] petrol, int[] distance) {

        int start = 0;
        int total = 0;
        int current = 0;

        for (int i = 0; i < petrol.length; i++) {

            int diff = petrol[i] - distance[i];
            total += diff;
            current += diff;

            if (current < 0) {
                start = i + 1;
                current = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}

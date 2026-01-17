package com.sorting.eventmanager;

public class Manage {

    public static void quickSort(Event[] events, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivotIndex = partition(events, start, end);

        quickSort(events, start, pivotIndex - 1);
        quickSort(events, pivotIndex + 1, end);
    }

    private static int partition(Event[] events, int start, int end) {

        double pivot = events[end].getPrice();
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (events[j].getPrice() <= pivot) {
                i++;
                Event temp = events[i];
                events[i] = events[j];
                events[j] = temp;
            }
        }

        Event temp = events[i + 1];
        events[i + 1] = events[end];
        events[end] = temp;

        return i + 1;
    }
}

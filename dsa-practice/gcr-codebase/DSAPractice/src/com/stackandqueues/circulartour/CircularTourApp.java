package com.stackandqueues.circulartour;

public class CircularTourApp {

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        CircularTour ct = new CircularTour();
        int start = ct.findStartPoint(petrol, distance);

        System.out.println("Start Point: " + start);
    }
}

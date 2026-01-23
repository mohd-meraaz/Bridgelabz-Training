package com.bridgelabz.geomeasurelines;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Line> lineList = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int comparisons = scanner.nextInt();

        for (int i = 1; i <= comparisons; i++) {
            System.out.println("\nComparison " + i);

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
            Line line1 = new Line(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
            );

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
            Line line2 = new Line(
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble()
            );

            lineList.add(line1);
            lineList.add(line2);

            line1.compareLines(line2);
        }

        scanner.close();
    }
}

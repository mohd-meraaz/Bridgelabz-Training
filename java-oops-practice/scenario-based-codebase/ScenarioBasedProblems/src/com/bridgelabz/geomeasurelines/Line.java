package com.bridgelabz.geomeasurelines;

class Line {
    private double x1, y1, x2, y2;

    // Constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length of the line
    public double calculateLength() {
        return Math.sqrt(
            Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)
        );
    }

    // Method to compare two lines
    public void compareLines(Line otherLine) {
        double length1 = this.calculateLength();
        double length2 = otherLine.calculateLength();

        if (length1 == length2) {
            System.out.println("Both lines are of equal length.");
        } else if (length1 > length2) {
            System.out.println("First line is longer.");
        } else {
            System.out.println("Second line is longer.");
        }
    }
}

package com.sorting.hospitalqueue;

public class Main {

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient(101, "Ravi", 4),
            new Patient(102, "Anita", 9),
            new Patient(103, "Karan", 6),
            new Patient(104, "Meena", 10),
            new Patient(105, "Arjun", 3)
        };

        System.out.println("Before Sorting (Arrival Order):");
        for (Patient p : patients) {
            p.display();
        }

        HospitalQueue.bubbleSortByCriticality(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        for (Patient p : patients) {
            p.display();
        }
        
    }
}

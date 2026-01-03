package com.bridgelabz.hospitalmanagementsystem;

public class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(String id, String name, int age,
                     int daysAdmitted, boolean emergency) {

        super(id, name, age, "Stored Securely", emergency);

        if (daysAdmitted <= 0) {
            throw new IllegalArgumentException("Days admitted must be > 0");
        }

        this.daysAdmitted = daysAdmitted;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            getSummary() + "\nType: InPatient \nDays Admitted: " + daysAdmitted
        );
        System.out.println();
    }
}

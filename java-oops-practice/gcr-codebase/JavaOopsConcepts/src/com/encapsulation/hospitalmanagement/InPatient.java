package com.encapsulation.hospitalmanagement;

/*
 * In-patient with room and daily charges.
 */
public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge = 2000;

    public void setAdmissionDetails(int daysAdmitted) {
        if (daysAdmitted <= 0) {
            System.out.println("Invalid admission days!");
            return;
        }
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis, String notes) {
        setMedicalData(diagnosis, notes);
    }

    @Override
    public void viewRecords() {
        showMedicalData();
    }
}

package com.encapsulation.hospitalmanagement;

/*
 * Out-patient with consultation fee.
 */
public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee = 500;

    @Override
    public double calculateBill() {
        return consultationFee;
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

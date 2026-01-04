package com.encapsulation.hospitalmanagement;

/*
 * Abstract base class for all patients.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    // Encapsulation using setters
    public void setPatientDetails(int patientId, String name, int age) {
        if (patientId <= 0 || age <= 0) {
            System.out.println("Invalid patient details!");
            return;
        }
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Protected methods for subclasses / interfaces
    protected void setMedicalData(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    protected void showMedicalData() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }

    // Abstract billing method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

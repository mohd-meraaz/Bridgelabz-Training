package com.bridgelabz.hospitalmanagementsystem;



public abstract class Patient {

    private final String patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive
    protected boolean emergency;

    // Normal admission
    public Patient(String patientId, String name, int age) {
        this(patientId, name, age, "Not Provided", false);
    }

    // Emergency admission (overloaded)
    public Patient(String patientId, String name, int age,
                   String medicalHistory, boolean emergency) {

        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.emergency = emergency;
    }

    // Encapsulation
    public String getPatientId() {
        return patientId;
    }

    public String getSummary() {
        return "Patient: " + name +
               ", Age: " + age +
               ", Emergency: " + emergency;
    }

    // No public getter for medical history (security)
    protected String getMedicalHistoryInternal() {
        return medicalHistory;
    }

    // Polymorphism
    public abstract void displayInfo();
}

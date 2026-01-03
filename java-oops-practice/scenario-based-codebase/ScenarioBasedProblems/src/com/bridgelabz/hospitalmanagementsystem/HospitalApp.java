package com.bridgelabz.hospitalmanagementsystem;


import java.util.ArrayList;
import java.util.List;

public class HospitalApp {

    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public void registerPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayAllPatients() {
        for (Patient p : patients) {
            p.displayInfo(); 
        }
    }

    public static void main(String[] args) {

        HospitalApp hospital = new HospitalApp();

        // Doctors
        Doctor d1 = new Doctor("D101", "Dr. Rohit", "Cardiology");
        hospital.addDoctor(d1);

        // Patients
        Patient p1 = new InPatient("P001", "Ram", 30, 5, true);
        Patient p2 = new OutPatient("P002", "Karan", 22);

        hospital.registerPatient(p1);
        hospital.registerPatient(p2);

        // Billing
        Bill bill = new Bill(5000, 0.18, 500);

        // Output
        d1.displayInfo();
        System.out.println();

        hospital.displayAllPatients();
        System.out.println();

        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }
}

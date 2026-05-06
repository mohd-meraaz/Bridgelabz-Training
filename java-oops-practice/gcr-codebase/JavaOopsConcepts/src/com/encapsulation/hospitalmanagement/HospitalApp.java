package com.encapsulation.hospitalmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Hospital Patient Management System.
 * Demonstrates polymorphism using Patient reference.
 */
public class HospitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Hospital Patient Management System =====");
            System.out.println("1. Add In-Patient");
            System.out.println("2. Add Out-Patient");
            System.out.println("3. View Patient Bills");
            System.out.println("4. View Medical Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    InPatient in = new InPatient();
                    addPatient(sc, in);

                    System.out.print("Enter Days Admitted: ");
                    int days = sc.nextInt();
                    sc.nextLine();

                    in.setAdmissionDetails(days);
                    addMedicalRecord(sc, in);

                    patients.add(in);
                    System.out.println("In-Patient added!");
                    break;

                case 2:
                    OutPatient out = new OutPatient();
                    addPatient(sc, out);
                    addMedicalRecord(sc, out);

                    patients.add(out);
                    System.out.println("Out-Patient added!");
                    break;

                case 3:
                    for (Patient p : patients) {
                        System.out.println("\n-------------------");
                        p.getPatientDetails();
                        System.out.println("Bill Amount: " + p.calculateBill());
                    }
                    break;

                case 4:
                    for (Patient p : patients) {
                        System.out.println("\n-------------------");
                        p.getPatientDetails();
                        ((MedicalRecord) p).viewRecords();
                    }
                    break;

                case 5:
                    System.out.println("Exiting Hospital Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper methods

    private static void addPatient(Scanner sc, Patient p) {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        p.setPatientDetails(id, name, age);
    }

    private static void addMedicalRecord(Scanner sc, MedicalRecord m) {
        System.out.print("Enter Diagnosis: ");
        String diagnosis = sc.nextLine();

        System.out.print("Enter Medical Notes: ");
        String notes = sc.nextLine();

        m.addRecord(diagnosis, notes);
    }
}

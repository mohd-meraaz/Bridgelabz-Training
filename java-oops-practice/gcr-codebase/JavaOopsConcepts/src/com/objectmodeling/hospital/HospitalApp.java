package com.objectmodeling.hospital;

public class HospitalApp {
	public static void main(String[] args) {

        Hospital hospital = new Hospital("Kingsway Hospital");

        Doctor doc1 = new Doctor("Dr. Ram");
        Doctor doc2 = new Doctor("Dr. Bhuvan");

        Patient pat1 = new Patient("Rahul");
        Patient pat2 = new Patient("Kaif");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Consultations (association + communication)
        doc1.consultWithDoctor(pat1);
        doc1.consultWithDoctor(pat2);
        doc2.consultWithDoctor(pat1);

        System.out.println();
        hospital.displayHospital();
        System.out.println();
        doc1.viewPatients();
        System.out.println();
        pat1.viewDoctors();
    }

}

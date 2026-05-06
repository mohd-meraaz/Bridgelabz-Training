package com.encapsulation.hospitalmanagement;

/*
 * Interface for handling patient medical records.
 */
public interface MedicalRecord {

    void addRecord(String diagnosis, String notes);

    void viewRecords();
}

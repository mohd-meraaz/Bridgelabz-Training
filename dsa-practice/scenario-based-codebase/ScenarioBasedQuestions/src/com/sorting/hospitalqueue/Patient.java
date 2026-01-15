package com.sorting.hospitalqueue;


public class Patient {
    private int patientId;
    private String name;
    private int criticalityLevel; // 1 (low) → 10 (high)

    public Patient(int patientId, String name, int criticalityLevel) {
        this.patientId = patientId;
        this.name = name;
        this.criticalityLevel = criticalityLevel;
    }

    public int getCriticalityLevel() {
        return criticalityLevel;
    }

    public void display() {
        System.out.println(
            "ID: " + patientId +
            ", Name: " + name +
            ", Criticality: " + criticalityLevel
        );
    }
}

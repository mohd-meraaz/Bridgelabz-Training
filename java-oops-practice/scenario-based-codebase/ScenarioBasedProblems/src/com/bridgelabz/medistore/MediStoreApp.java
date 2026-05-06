package com.bridgelabz.medistore;

import java.time.LocalDate;

public class MediStoreApp {
    public static void main(String[] args) {

        Medicine tab = new Tablet("Paracetamol", 2.5, LocalDate.of(2026, 5, 20));
        Medicine syrup = new Syrup("Cough Syrup", 90, LocalDate.of(2026, 3, 15));
        Medicine inj = new Injection("Insulin", 350, LocalDate.of(2025, 12, 1));

        System.out.println("Tablet Sale Amount: " + tab.sell(15));
        System.out.println("Syrup Sale Amount: " + syrup.sell(2));
        System.out.println("Injection Sale Amount: " + inj.sell(1));

        System.out.println("Remaining Tablet Stock: " + tab.getQuantity());
    }
}

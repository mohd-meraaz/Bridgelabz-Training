package com.bridgelabz.payxpress;

import java.time.LocalDate;

public class PayXpressApp {
    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, LocalDate.of(2026, 1, 20));
        Bill b2 = new InternetBill(800, LocalDate.of(2026, 1, 15));
        Bill b3 = new WaterBill(400, LocalDate.of(2026, 1, 18));

        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        b1.pay();

        System.out.println("Late fee if unpaid: ₹" + b2.calculateLateFee());
    }
}

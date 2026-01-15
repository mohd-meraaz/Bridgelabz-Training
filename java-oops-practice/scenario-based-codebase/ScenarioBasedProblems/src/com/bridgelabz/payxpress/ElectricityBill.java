package com.bridgelabz.payxpress;

import java.time.LocalDate;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Electricity bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Pay electricity bill before " + dueDate);
    }
}

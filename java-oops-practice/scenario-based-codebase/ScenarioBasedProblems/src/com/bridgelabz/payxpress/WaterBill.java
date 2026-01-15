package com.bridgelabz.payxpress;
import java.time.LocalDate;
class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Water bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Water bill due on " + dueDate);
    }
}

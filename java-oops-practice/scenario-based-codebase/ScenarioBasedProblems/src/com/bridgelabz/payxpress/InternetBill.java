package com.bridgelabz.payxpress;

import java.time.LocalDate;

class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Internet service will be suspended after " + dueDate);
    }
}

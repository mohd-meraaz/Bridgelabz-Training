package com.bridgelabz.medistore;
import java.time.LocalDate;
public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double sell(int units) {
        if (!checkExpiry() && getQuantity() >= units) {
            updateStock(units);
            return calculateTotalPrice(units);
        }
        return 0;
    }

    @Override
    public boolean checkExpiry() {
        return isExpired() || expiryDate.minusMonths(1).isBefore(LocalDate.now());
        // liquid meds expire earlier after opening
    }
}

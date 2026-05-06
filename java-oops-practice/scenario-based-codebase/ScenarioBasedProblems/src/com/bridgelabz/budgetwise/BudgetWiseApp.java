package com.bridgelabz.budgetwise;

import java.time.LocalDate;
import java.util.*;

public class BudgetWiseApp {
    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Rent", 15000.0);

        Budget budget = new MonthlyBudget(30000, 25000, categories);

        budget.addTransaction(
            new Transaction(4000, "EXPENSE", LocalDate.now(), "Food")
        );
        budget.addTransaction(
            new Transaction(16000, "EXPENSE", LocalDate.now(), "Rent")
        );

        budget.generateReport();
        budget.detectOverspend();
    }
}

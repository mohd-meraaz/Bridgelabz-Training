package com.bridgelabz.budgetwise;

import java.util.Map;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                        Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n📊 Annual Budget Summary");
        System.out.println("Yearly Income: ₹" + income);
        System.out.println("Total Expenses: ₹" + totalExpenses());
        System.out.println("Net Savings: ₹" + netSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("⚠ Annual budget exceeded!");
        }
    }
}

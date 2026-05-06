package com.bridgelabz.budgetwise;

import java.util.Map;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit,
                         Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n📅 Monthly Budget Report");
        System.out.println("Income: ₹" + income);
        System.out.println("Expenses: ₹" + totalExpenses());
        System.out.println("Savings: ₹" + netSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = categoryWiseExpenses();
        for (String cat : spent.keySet()) {
            if (spent.get(cat) > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
                System.out.println("Overspend in " + cat);
            }
        }
    }
}

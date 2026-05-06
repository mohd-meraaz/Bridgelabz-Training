package com.bridgelabz.budgetwise;

import java.util.*;

abstract class Budget implements IAnalyzable {
    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    private List<Transaction> transactions;   // encapsulated

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled expense addition
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.type.equals("EXPENSE")) {
                sum += t.amount;
            }
        }
        return sum;
    }

    // Operator usage
    public double netSavings() {
        return income - totalExpenses();
    }

    protected Map<String, Double> categoryWiseExpenses() {
        Map<String, Double> map = new HashMap<>();
        for (Transaction t : transactions) {
            if (t.type.equals("EXPENSE")) {
                map.put(
                    t.category,
                    map.getOrDefault(t.category, 0.0) + t.amount
                );
            }
        }
        return map;
    }
}

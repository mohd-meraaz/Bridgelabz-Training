package com.stackandqueues.stockspan;

public class StockSpanApp {

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpan ss = new StockSpan();
        int[] result = ss.calculateSpan(prices);

        for (int span : result) {
            System.out.print(span + " ");
        }
    }
}

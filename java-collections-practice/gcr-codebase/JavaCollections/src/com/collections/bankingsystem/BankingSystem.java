package com.collections.bankingsystem;

import java.util.*;

public class BankingSystem {

    // Stores accountNumber -> balance
    private HashMap<Integer, Double> accounts = new HashMap<>();

    // Queue for withdrawal processing
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Create account
    public void createAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
    }

    // Add withdrawal request to queue
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    // Process withdrawals in FIFO order
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            double balance = accounts.get(request.accountNumber);

            if (balance >= request.amount) {
                accounts.put(request.accountNumber, balance - request.amount);
                System.out.println("Withdrawal successful for Account "
                        + request.accountNumber);
            } else {
                System.out.println("Insufficient balance for Account "
                        + request.accountNumber);
            }
        }
    }

    // Display customers sorted by balance
    public void displaySortedByBalance() {

        TreeMap<Integer, Double> sortedByBalance =
                new TreeMap<>((a, b) -> {
                    int compare = accounts.get(a).compareTo(accounts.get(b));
                    return compare == 0 ? a.compareTo(b) : compare;
                });

        sortedByBalance.putAll(accounts);

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Integer, Double> entry : sortedByBalance.entrySet()) {
            System.out.println("Account " + entry.getKey()
                    + " -> Balance: " + entry.getValue());
        }
    }
}

package com.objectmodeling.assistedproblems;

public class Bank {
	private String bankName;

    // Constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Association: Bank opens account for Customer
    void openAccount(Customer customer, int initialBalance) {
        customer.addBalance(initialBalance);
        System.out.println("Bank Account opened in " + bankName);
    }

    
	
	
	
	

}

package com.bridgelabz.mybank;


//Super class implements ITransaction interface
public class Account implements ITransaction {
	
	//Private instance of class
	private double balance;
	
	//Protected instance of class
	protected double interestRate;
	protected String accountType;
	
	//Parameterized constructor
	public Account(double interestRate, double openingBalance) {
		this.interestRate = interestRate;
		this.balance += openingBalance;
		System.out.println("Account Created Successfully");
	}
	
	//Parameterized constructor
	public Account(double interestRate) {
		this.interestRate = interestRate;
		System.out.println("Account Created Successfully");
	}
	
	//Method to set interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Method to set account type
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//Method to get balance
	public double getBalance() {
		return balance;
	}
	
	//method to get balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	@Override
	public void deposite(double amount) {
		balance += amount;
		
	}
	@Override
	public void withdraw(double amount) {
	
		balance -= amount;
		
	}
	@Override
	public void checkBalance() {
		
		System.out.println("Bank balanced -> " + balance);
		
	}
	
	//Method to calculate interest
	public double calculateInterest(double amount) {
		double interest = (amount * interestRate) / 100;
		return amount + interest;
	}
	
	
	
	
}
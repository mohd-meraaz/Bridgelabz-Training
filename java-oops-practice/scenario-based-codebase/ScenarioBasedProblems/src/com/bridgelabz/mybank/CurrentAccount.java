package com.bridgelabz.mybank;

//Inheriting properties of Account class
public class CurrentAccount extends Account {

	//Parameterized constructor
	public CurrentAccount(double interestRate) {
		super(interestRate);
		

	}

	//Overriding parameterized constructor
	public CurrentAccount(double interestRate, double openingBalance) {
		super(interestRate, openingBalance);
		setAccountType("Saving Account");
	}
	
	//Overriding method
	@Override
	public void deposite(double amount) {
		double interest = calculateInterest(amount);
		setBalance(getBalance() + interest);
		System.out.println(amount + " amount deposite successfully");
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(getBalance()<amount) {
			System.out.println("Balance is low");
		}
		else {
			setBalance(getBalance() - amount);
			System.out.println(amount + " amount withdraw successfully");
		
		}
		
	}
	@Override
	public void checkBalance() {
		
		System.out.println("Bank balance -> " + getBalance());
		
	}
	
}
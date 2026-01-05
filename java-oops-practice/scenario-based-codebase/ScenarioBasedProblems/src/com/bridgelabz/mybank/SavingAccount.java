package com.bridgelabz.mybank;

//Inheriting properties of Account class
public class SavingAccount extends Account {

	//parameterized constructor
	public SavingAccount(double interestRate) {
		super(interestRate);
		setAccountType("Saving Account");
		
	}

	//Overriding parameterized constructor
	public SavingAccount(double interestRate, double openingBalance) {
		super(interestRate, openingBalance);
		setAccountType("Saving Account");
	
	}
	
	//Overriding methods
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
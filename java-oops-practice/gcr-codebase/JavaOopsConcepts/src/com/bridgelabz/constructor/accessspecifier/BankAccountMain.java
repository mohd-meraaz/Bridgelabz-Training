package com.bridgelabz.constructor.accessspecifier;

public class BankAccountMain {
	public static void main(String[] args) {
	     SavingsAccount user1 = new SavingsAccount(1002, "Amit", 250030);
	     SavingsAccount user2 = new SavingsAccount(1001, "Rahul", 2500000);
	     SavingsAccount user3 = new SavingsAccount(1003, "rohan", 250200);
	     user1.displayAccountDetails();
	     user2.displayAccountDetails();
	     user3.displayAccountDetails();
	 }

}

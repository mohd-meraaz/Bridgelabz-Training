package com.bridgelabz.mybank;

//Interface
public interface ITransaction {
	void deposite(double amount);
	void withdraw(double amount);
	void checkBalance();
}
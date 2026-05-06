package com.bridgelabz.constructor.accessspecifier;

//Subclass
class SavingsAccount extends BankAccount {

 SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: ₹" + getBalance());
 }

 
}

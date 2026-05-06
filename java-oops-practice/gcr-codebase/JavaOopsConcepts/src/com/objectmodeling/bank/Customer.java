package com.objectmodeling.bank;

public class Customer {
	
	private String name;
	private long phoneNumber;
	private double balance;
	
	
	//Constructors
	Customer(String name) {
        this.name = name;
        this.balance = 0;
        this.phoneNumber = 0;
    }
	Customer(String name,long phoneNumber) {
        this.name = name;
        this.balance = 0;
        this.phoneNumber = phoneNumber;
    }
	
    
	// Method used by Bank to add balance
    void addBalance(int amount) {
        this.balance += amount;
        System.out.println("The balance of "+amount+" added succesfully.");
        System.out.println("The coustomer "+name+" now has a "+balance+" of Rupees in bank account.");
        
    }
    
    public void setPhoneNumber(long phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
	
	public void viewBalance() {
		System.out.println("The coustomer "+name+" has a "+balance+" of Rupees in bank account.");
		
	}
}

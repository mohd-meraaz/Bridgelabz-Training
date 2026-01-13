package com.bridgelabz.budgetwise;

import java.time.LocalDate;

public class Transaction {
	double amount;
	String type;
	LocalDate date;
	String category;
	
	public Transaction(double amount, String type,LocalDate localDate, String category){
		 this.amount    = amount;
		 this.type      = type;
	     this.date      = localDate;
	     this.category  = category;
	}
	
	

}

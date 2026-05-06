package com.lambda.invoicecreation;

public class Invoice {
	String transactionId;
	
	Invoice(String _transactionId){
		this.transactionId = _transactionId;
	}
	
	@Override
	public String toString() {
		return ("Transaction Id :- "+transactionId);
	}
}

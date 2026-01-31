package com.lambda.invoicecreation;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class InvoiceObjectCreation {
	public static void main(String[] args) {
		ArrayList<String> id = new ArrayList<>();
		
		id.add("ID0002");
		id.add("ID0003");
		id.add("ID0004");
		id.add("ID0006");
		id.add("ID0007");
		id.add("ID0009");
		
		ArrayList<Invoice> invoice = (ArrayList<Invoice>) id.stream().map(Invoice :: new ).collect(Collectors.toList());
		invoice.stream().forEach(System.out::println);
		
		
	}

}

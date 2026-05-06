package com.generics.resumescreening;

public class ProductManager extends JobRole{
	
	private int communicationScore;
	
	public ProductManager(String candidateName, int communicationScore) {
		super(candidateName);
		this.communicationScore = communicationScore;
	}

	@Override
	String getRoleName() {
		return "Product Manager";
	}

	@Override
	boolean screenResume() {
		return communicationScore>=90;
	}
}
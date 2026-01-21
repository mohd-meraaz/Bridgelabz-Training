package com.generics.resumescreening;

public class DataScientist extends JobRole{
	private int mlScore;
	
	// constructor
	public DataScientist(String candidateName, int mlScore) {
		super(candidateName);
		this.mlScore = mlScore;
	}

//	Methods to get the jobRole
	@Override
	String getRoleName() {
		return "Data Scientist";
	}

	@Override
	boolean screenResume() {
		return mlScore>=60;
	}
}

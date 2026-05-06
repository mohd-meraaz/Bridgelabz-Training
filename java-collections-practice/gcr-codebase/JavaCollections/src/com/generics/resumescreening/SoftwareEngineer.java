package com.generics.resumescreening;

public class SoftwareEngineer extends JobRole{
	private int score;
	
	public SoftwareEngineer(String candidateName, int score) {
		super(candidateName);
		this.score = score;
	}

	@Override
	String getRoleName() {
		return "Software Engineer";
	}

	@Override
	boolean screenResume() {
		return score>=70;
	}
}
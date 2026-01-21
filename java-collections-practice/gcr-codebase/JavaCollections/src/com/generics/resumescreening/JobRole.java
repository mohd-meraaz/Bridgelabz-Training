package com.generics.resumescreening;

public abstract class JobRole {
	protected String candidateName;

	public JobRole(String candidateName) {
		this.candidateName = candidateName;
	}
	
	abstract String getRoleName();
	
	abstract boolean screenResume();
}
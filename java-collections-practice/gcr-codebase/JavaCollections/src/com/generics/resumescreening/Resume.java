package com.generics.resumescreening;

public class Resume<T extends JobRole> {
	private T candidate;
	
	//resume
	public Resume(T candidate) {
		this.candidate = candidate;
	}
	
	//screening
	public void processScreening() {
		System.out.println("Processing resume for -> "+candidate.getRoleName());
		System.out.println("Candidate Name: "+candidate.candidateName);
		
		if(candidate.screenResume()) {
			System.out.println("Resume Shortlisted.");
		}else {
			System.out.println("Resume Not Shortlisted!");
		}
	}
	
	//public void get candidate
	public T getCandiate() {
		return candidate;
	}
}
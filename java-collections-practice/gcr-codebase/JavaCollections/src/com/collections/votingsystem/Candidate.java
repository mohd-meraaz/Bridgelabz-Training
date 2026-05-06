package com.collections.votingsystem;

public class Candidate {
    private String name;
    private boolean voted;
    
	public Candidate(String name) {
		this.name = name;
		this.voted = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVoted() {
		return voted;
	}

	public void setVoted(boolean voted) {
		this.voted = voted;
	}
    
}
package com.collections.insurancepolicysystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Policy {
    private long policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private ArrayList<Coverage> coverage = new ArrayList<>();
	
    public Policy(long policyNumber, String policyHolderName, LocalDate expiryDate) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
	}
    public void policyDetails() {
    	System.out.println("----------Policy Details-----------");
    	System.out.println("Policy Number      : "+ getPolicyNumber());
    	System.out.println("Policy Holder Name : "+ getPolicyHolderName());
    	System.out.println("Expiry Date        : "+ getExpiryDate());
    	System.out.println("Policy Coverage    :--");
    	for(Coverage a : coverage) {
    	System.out.println(" * "+a);
    	}
    }
    public void addCoverage(Coverage cover) {
    		this.coverage.add(cover);
    }
	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ArrayList<Coverage> getCoverage() {
		return coverage;
	}

	public void setCoverage(ArrayList<Coverage> coverage) {
		this.coverage = coverage;
	}
    
    
}
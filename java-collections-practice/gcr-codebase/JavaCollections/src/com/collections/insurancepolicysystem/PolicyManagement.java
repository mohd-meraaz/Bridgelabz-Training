package com.collections.insurancepolicysystem;
import java.time.LocalDate;
import java.util.HashSet;

public class PolicyManagement {
	public static void main(String[] args) {
		HashSet<Policy> set = new HashSet<>();
		Policy policy = new Policy(101,"Lucky",LocalDate.of(2027,03, 27));
		policy.addCoverage(Coverage.life);
		Policy policy2 = new Policy(102,"Nageshwar",LocalDate.of(2026,9,5));
		policy2.addCoverage(Coverage.health);
		policy2.addCoverage(Coverage.auto);
		set.add(policy2);
		set.add(policy);
		System.out.println("\n");
		for(Policy a : set) {
			a.policyDetails();
		}
	}
}

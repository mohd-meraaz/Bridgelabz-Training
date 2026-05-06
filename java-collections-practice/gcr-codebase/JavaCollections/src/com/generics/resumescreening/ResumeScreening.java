package com.generics.resumescreening;

public class ResumeScreening {
	public static void main(String[] args) {
		JobRole data = new DataScientist("Ravi",53);
		Resume<JobRole> resume = new Resume<>(data);
		resume.processScreening();
		
		
		JobRole software = new SoftwareEngineer("allu",83);
		Resume<JobRole> resume1 = new Resume<>(software);
		resume1.processScreening();
		
		
		JobRole product = new ProductManager("Ravi",53);
		Resume<JobRole> resume2 = new Resume<>(product);
		resume2.processScreening();
	}
}

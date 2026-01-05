package com.bridgelabz.cabbygo;


//Customer class implement IRideService interface
public class Customer implements IRideService {
	
	//protected instance of class
	protected String name;
	protected double distance;
	protected Driver driver;
	
	//Parameterized constructor
	public Customer(String name, double balance, Driver driver) {
		
		this.name = name;
		this.distance = balance;
		this.driver = driver;
	}

	//Overriding bookRide method
	@Override
	public void bookRide() {
		System.out.println(name + " booked " + driver.vehicle.type + " for " + distance + " meters distance successfully");
		System.out.println("After reaching your destination Rate driver out of 5");
	}
	
	//Overriding endRide method
	@Override
	public void endRide(double rating) {
		
		double totalFair = calculateFare(driver.vehicle.getBaseRate(),distance,driver.getRate()); 
		System.out.println("Reached your destination successfully");
		System.out.println("Total fair " + totalFair);
		driver.setRating(rating);
		
		
	}
	
	//Method to calculate fare
	public double calculateFare(double baseFare, double distance2,double rate) {
		return baseFare + (distance2 * rate);
	}
	
	
	
	
}
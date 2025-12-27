package com.bridgelabz.constructor.levelone;

public class CarRental {
	
	String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("----------------------");
    }

	public static void main(String[] args) {
		CarRental gWagon = new CarRental("Meraaz", "G-Wagon",30);
		gWagon.costPerDay = 30000;
		
		gWagon.displayRentalDetails();
		

	}

}

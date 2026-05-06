package com.bridge.csv.com.bridge.csv.json.convertobjecttojson;
class Car{
//	Car("Toyota", "Fortuner", 3500000.5);
	String brand;
	String carName;
	double price;
	public Car(String brand, String carName, double price) {
		super();
		this.brand = brand;
		this.carName = carName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", carName=" + carName + ", price=" + price + "]";
	}
	
}
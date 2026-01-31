package com.functionalinterface.multivehiclerental;

@FunctionalInterface
public interface Vehicle {
	void rent();
	
	default void returnVehicle() {
		System.out.println("Vehicle return!");
	}
}
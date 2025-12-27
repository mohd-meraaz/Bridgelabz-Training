package com.bridgelabz.constructor.levelone;

public class Circle {
	
	double radius;
	
	Circle(){
		// Default constructor
	}
	
	Circle(double radius){
		// Default constructor
		this.radius = radius;
	}
	
	public void display() {
		System.out.println("This radius of the given circle is : "+this.radius);
	}
	
	

	public static void main(String[] args) {
		
		Circle circle = new Circle(25.0);
		
		circle.display();
		

	}

}



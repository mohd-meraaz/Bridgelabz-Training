package com.bridgelabz.constructor.accessspecifier;

class StudentMain{
	public static void main(String[] args) {
        PostgraduateStudent pg1 = new PostgraduateStudent(101, "Rahul", 8.5);
        PostgraduateStudent pg2 = new PostgraduateStudent(102, "Rohan", 8.4);
        PostgraduateStudent pg3 = new PostgraduateStudent(103, "Rohit", 8.9);
        PostgraduateStudent pg4 = new PostgraduateStudent(104, "Rahil", 7.5);
        pg1.displayDetails();
        pg2.displayDetails();
        pg3.displayDetails();
        pg4.displayDetails();
        
    }
	
}
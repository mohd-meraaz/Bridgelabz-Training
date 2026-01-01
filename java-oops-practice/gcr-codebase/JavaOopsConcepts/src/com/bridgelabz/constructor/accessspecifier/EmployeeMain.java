package com.bridgelabz.constructor.accessspecifier;

public class EmployeeMain {
	 public static void main(String[] args) {
	        Manager manager1 = new Manager(501, "IT", 80000);
	        Manager manager2 = new Manager(502, "HR", 40000);
	        Manager manager3 = new Manager(503, "Dev", 100000);
	        System.out.println("-------------------------------");
	        manager1.displayEmployeeDetails();
	        System.out.println("-------------------------------");
	        manager2.displayEmployeeDetails();
	        System.out.println("-------------------------------");
	        manager3.displayEmployeeDetails();
	        System.out.println("-------------------------------");
	    }

}

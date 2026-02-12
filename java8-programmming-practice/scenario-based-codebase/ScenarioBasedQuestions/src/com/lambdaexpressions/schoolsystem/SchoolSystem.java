package com.lambdaexpressions.schoolsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class SchoolSystem {
public static void main(String[] args) {
		
//		.Use a lambda expression to print a welcome message for a student.
	    Greeting greet = (String s)->System.out.println("Welcome student "+s);
	    greet.greet("Lucky");
//
//		2.Use lambda to check if a student is pass or fail based on marks.
		int marks ;
		System.out.print("\nEnter Your marks:- ");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		Predicate<Integer> result = (Integer m) -> m>33 ;
		 
		System.out.println(result.test(marks)?"You are Pass":"You are Fail");

//		3.Sort students by name using lambda.
		ArrayList<String> students = new ArrayList<>();
		students.add("Titu");
		students.add("Lucky");
		students.add("Arvind");
		students.add("Anni");
		students.add("Suraj");
		students.add("Avinash");
		
		
//
//		4.Sort students by rank using lambda.
//
//		5.Use lambda to display students whose age is above 18.
	}
}

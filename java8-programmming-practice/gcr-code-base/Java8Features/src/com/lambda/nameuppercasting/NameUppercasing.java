package com.lambda.nameuppercasting;

import java.util.ArrayList;

import com.lambda.hospitalidprinting.Patient;

public class NameUppercasing {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Titu" , 23));
		emp.add(new Employee("Lucky" , 23));
		emp.add(new Employee("Anni" , 22));
		emp.add(new Employee("Ram" , 21));
		emp.add(new Employee("Suraj" , 23));
		
		emp.stream().map(x->x.name).map(String::toUpperCase).forEach(System.out::println);
		
		
	}

}

package com.employeescenario;

import java.util.*;
import java.util.stream.Collectors;


public class EmployeeApp {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(2, "Titu", 20, "Male", "Tech", 2022, 200000.00));
		emp.add(new Employee(1, "Lucky", 22, "Male", "Tech", 2004, 300000.00));
		emp.add(new Employee(5, "Priya", 18, "Female", "Sales", 2022, 60000.00));
		emp.add(new Employee(56, "Roshni", 22, "Female", "Management", 2025, 29000.00));
		emp.add(new Employee(277, "Prince", 22, "Male", "Sales", 2010, 29000.00));
		
		// 1. How many male and female employees are there in the organization ?
		long maleCount = emp.stream().filter(e->e.gender.equalsIgnoreCase("male")).count();
		System.out.println(maleCount);
		long femaleCount = emp.stream().filter(e->e.gender.equalsIgnoreCase("female")).count();
		System.out.println(femaleCount);
		System.out.println("------------------------------------------------------------------");
		
		
         // 2. Print the name of all departments in the organization ?
		List<String> dept = emp.stream().map(s->s.department).distinct().toList();
		System.out.println(dept);
		System.out.println("------------------------------------------------------------------");
		
         //	3. What is the average age of male and female employees ?
		double maleAvg = emp.stream().filter(e->e.gender.equalsIgnoreCase("male"))
				.collect(Collectors.summarizingInt(e->e.age)).getAverage();
		System.out.println(maleAvg);
		double femaleAvg = emp.stream().filter(e->e.gender.equalsIgnoreCase("female"))
				.collect(Collectors.summarizingInt(e->e.age)).getAverage();
		System.out.println(femaleAvg);
		System.out.println("------------------------------------------------------------------");
		
         //	4. Get the details of highest paid employee in the organization ?
		emp.stream().max(Comparator.comparingDouble(e->e.salary))
			.ifPresent(System.out::println);
		System.out.println("------------------------------------------------------------------");
		
         //	5. Get the names of all employees who have joined after 2015 ?
		emp.stream().filter(e->e.yearOfJoining>2015).forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");
		
         //	6. Count the number of employees in each department ?
		Map<String, Long> deptCount = emp.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
		deptCount.forEach((d,c)-> System.out.println(d+" " +c));
		System.out.println("------------------------------------------------------------------");
		
         //	7. What is the average salary of each department ?
		emp.stream().collect(Collectors.groupingBy(e->e.department,Collectors.averagingDouble(e->e.salary))).forEach((d,c)-> System.out.println(d+" " +c));;
		System.out.println("------------------------------------------------------------------");
		
		
		
         //	8. Get the details of youngest male employee in the product development department ?
		emp.stream().min(Comparator.comparingInt(e->e.age)).ifPresent(System.out::println);
		System.out.println("------------------------------------------------------------------");
		
         //	9. Who has the most working experience in the organization?
		emp.stream().min(Comparator.comparingInt(e->e.yearOfJoining)).ifPresent(System.out::println);
		System.out.println("------------------------------------------------------------------");
		
		
         //	10. How many male and female employees are there in the Sales team?
		emp.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()))
		.forEach((gen, cnt)->System.out.println(gen+" -> "+cnt));
		System.out.println("------------------------------------------------------------------");
		
         //	11. What is the average salary of male and female employees ?
		emp.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.averagingDouble(e->e.salary))).forEach((gen, cnt)->System.out.println(gen+" -> "+cnt));
		System.out.println("------------------------------------------------------------------");
		
         //	12. List down the names of all employees in each department ?
		emp.stream().collect(Collectors.groupingBy(e->e.department, Collectors.mapping(e->e.name, Collectors.toList()))).forEach((gen, cnt)->System.out.println(gen+" -> "+cnt));
		System.out.println("------------------------------------------------------------------");
		
         //	13. What is the average salary and total salary of the whole organization?
		Double avgSalary = emp.stream().collect(Collectors.summarizingDouble(s->s.salary)).getAverage();
		System.out.println("The average Salary of the while organization is :- " + avgSalary);
		System.out.println("------------------------------------------------------------------");
		
         //	14. Get the employee whose salary are more than 25k.
		emp.stream().filter(a -> a.salary>25000).forEach(e->System.out.println(e.name));
		System.out.println("------------------------------------------------------------------");
		
         //	15.Who is the highest paid employee in the organization?
		emp.stream().max(Comparator.comparingDouble(a->a.salary)).ifPresent(e->System.out.println(e.name));
		System.out.println("------------------------------------------------------------------");
         //	16.Who is the second highest paid employee in the organization?
//		emp.stream()
//		   .map(e -> e.salary)
//		   .sorted(Comparator.reverseOrder())
//		   .skip(1)
//		   .findFirst()
//		   .ifPresent(secondHighest -> 
//		       emp.stream()
//		          .filter(e -> e.salary == secondHighest)
//		          .forEach(e -> System.out.println(e.name))
//		   );


		 emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(e->System.out.println(e.name));
		
         //	17.Who is the third highest paid employee in the organization?
		
         //	18.Who is the lowest paid employee in the organization?
		
         //	19.Who is the second lowest paid employee in the organization?
		
         //	20.Get the first five lowest paid employee in the organization?
		
         //	21.Get the first five highest paid employee in the organization?
	}
}

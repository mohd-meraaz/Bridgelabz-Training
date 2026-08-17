package com.day12.practiceset.employee;

public class EmployeeMain {
    static void main() {
        Employee employee1 = new Employee("Rohit", "Sharma");
        Employee employee2 = new Employee("Virat", "Kohli");
        Employee employee3 = new Employee("Mahendra", "Dhoni");
        Employee employee4 = new Employee("AB", "D");

        System.out.println(employee1.getId());
        System.out.println(employee2.getId());
        System.out.println(employee3.getId());
        System.out.println(employee4.getId());
    }
}

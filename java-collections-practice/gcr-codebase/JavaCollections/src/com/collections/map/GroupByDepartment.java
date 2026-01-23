package com.collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDepartment {

    static class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Raju", "HR"),
            new Employee("Ramesh", "IT"),
            new Employee("Lucky", "HR")
        );

        Map<String, List<Employee>> groupedByDepartment =
            employees.stream()
                     .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(groupedByDepartment);
    }
}

package com.day13.practiceset;

public class _04EmployeeManager {
    public class Employee {
        private String name;
        private double salary;
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void getDetails() {
            System.out.println("Name : " +name);
            System.out.println("Salary : " +salary);
        }
    }

    public class Manager extends Employee {
        private int teamSize;
        public Manager(String name, double salary, int teamSize) {
            super(name, salary);
            this.teamSize = teamSize;
        }
        public Manager(String name, double salary) {
            super(name, salary);
        }

        @Override
        public void getDetails() {
            super.getDetails();
            System.out.println("Team Size : " +teamSize);
        }
    }

     void main() {
        Manager manager = new Manager("Manager", 8000,4);
        manager.getDetails();
        Employee employee = new Employee("Employee", 5000);
        employee.getDetails();
    }
}

package com.day14.classwork;

//Create an Employee class with calculateSalary() and override it in Manager and Developer.
// Use runtime polymorphism to calculate different salaries.

public class EmployeeDemo {
    class Employee{
        protected String name;
        private double salary;
        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }



        public double getSalary() {
            return salary;
        }

//        public void calculateSalary(){
//            System.out.println(salary);
//        }

        public void displayName(){
            System.out.println("Name :- " + this.name);
        }

    }
    public class Manager extends Employee{
        public Manager(String name, double salary){
            super(name, salary);
        }


        public void calculateSalary(){
            System.out.println("Manager's Salary " + this.getSalary()*1.10);
        }
    }
    public class Developer extends Employee{
        public Developer(String name, double salary){
            super(name, salary);
        }

        @Override
        public void displayName(){
            System.out.println("Developer name :- " + this.name);
        }

        public void calculateSalary(){
            System.out.println("Developer's Salary " + this.getSalary()*1.20);
        }
    }
    void main(){
        Employee employee = new Employee("Meraaz" , 20000);
        Manager manager = new Manager("Ali",20000);
        Developer developer = new Developer("Arvind",20000);
        Employee emp = new Developer("Rahul" , 20000.0);
        employee.displayName();
        emp.displayName();
//        employee.calculateSalary();
        manager.displayName();
//        developer.calculateSalary();
    }
}

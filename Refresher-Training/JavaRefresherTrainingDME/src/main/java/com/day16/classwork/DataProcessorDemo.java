package com.day16.classwork;

import java.util.ArrayList;
import java.util.List;

// Demonstrates how a generic interface can be implemented
// for different types of objects such as Student and Employee.
public class DataProcessorDemo {


    interface DataProcessor<T> {

        void add(T data);

        void remove(T data);

        void process(T data);
    }


    static class Student {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    static class StudentProcessor implements DataProcessor<Student> {

        private List<Student> students = new ArrayList<>();

        @Override
        public void add(Student student) {
            students.add(student);
        }

        @Override
        public void remove(Student student) {
            students.remove(student);
        }

        @Override
        public void process(Student student) {
            System.out.println("Student Name :- " + student.getName());
            System.out.println("Student Age  :- " + student.getAge());
        }
    }

    static class Employee {

        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    static class EmployeeProcessor implements DataProcessor<Employee> {

        private List<Employee> employees = new ArrayList<>();

        @Override
        public void add(Employee employee) {
            employees.add(employee);
        }

        @Override
        public void remove(Employee employee) {
            employees.remove(employee);
        }

        @Override
        public void process(Employee employee) {
            System.out.println("Employee Name :- " + employee.getName());
            System.out.println("Employee Age  :- " + employee.getAge());
        }
    }



    public static void main(String[] args) {



        Student student1 = new Student("Meraaz", 21);
        Student student2 = new Student("Ali", 23);

        StudentProcessor studentProcessor = new StudentProcessor();

        studentProcessor.add(student1);
        studentProcessor.add(student2);

        studentProcessor.process(student1);
        studentProcessor.process(student2);

        studentProcessor.remove(student2);


        System.out.println("-----------------------------");




        Employee employee1 = new Employee("Meraaz", 21);
        Employee employee2 = new Employee("Ali", 23);

        EmployeeProcessor employeeProcessor = new EmployeeProcessor();

        employeeProcessor.add(employee1);
        employeeProcessor.add(employee2);

        employeeProcessor.process(employee1);
        employeeProcessor.process(employee2);

        employeeProcessor.remove(employee2);
    }
}
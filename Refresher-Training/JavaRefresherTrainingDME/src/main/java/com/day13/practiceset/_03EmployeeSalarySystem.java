package com.day13.practiceset;

public class _03EmployeeSalarySystem {
    public class SalaryCalculator{
        private String id;
        public SalaryCalculator(String id){
            this.id = id;
        }

        public double calculateSalary(double salary){
            return salary;
        }

        public double calculateSalary(double salary, double bonus){
            return salary+bonus;
        }
        public double calculateSalary(double salary, double bonus,double deduction){
            return salary+bonus-deduction;
        }



    }

     void main() {
        SalaryCalculator salaryCalculator = new SalaryCalculator("1");
        System.out.println(salaryCalculator.calculateSalary(100000));
         System.out.println(salaryCalculator.calculateSalary(100000,10000));
         System.out.println(salaryCalculator.calculateSalary(100000,10000,1000));
    }
}

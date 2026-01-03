package com.inheritance.hybridinheritance.restaurant;

import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person staff = null; // 

        while (true) {
            System.out.println("\n===== Restaurant Management System =====");
            System.out.println("1. Add Chef");
            System.out.println("2. Add Waiter");
            System.out.println("3. Display Staff Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Chef chef = new Chef();

                    System.out.print("Enter Chef Name: ");
                    String cName = sc.nextLine();

                    System.out.print("Enter Chef ID: ");
                    int cId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Speciality: ");
                    String speciality = sc.nextLine();

                    chef.setDetails(cName, cId);
                    chef.setSpeciality(speciality);

                    staff = chef;
                    System.out.println("Chef added successfully!");
                    break;

                case 2:
                    Waiter waiter = new Waiter();

                    System.out.print("Enter Waiter Name: ");
                    String wName = sc.nextLine();

                    System.out.print("Enter Waiter ID: ");
                    int wId = sc.nextInt();

                    System.out.print("Enter Number of Tables Assigned: ");
                    int tables = sc.nextInt();
                    sc.nextLine();

                    waiter.setDetails(wName, wId);
                    waiter.setTableCount(tables);

                    staff = waiter;
                    System.out.println("Waiter added successfully!");
                    break;

                case 3:
                    if (staff != null) {
                        staff.showDetails();      // inherited method

                    } else {
                        System.out.println("No staff added yet.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Restaurant Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

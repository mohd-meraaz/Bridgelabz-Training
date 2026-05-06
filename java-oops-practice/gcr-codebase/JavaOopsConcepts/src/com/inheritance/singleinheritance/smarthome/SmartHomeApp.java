package com.inheritance.singleinheritance.smarthome;

import java.util.Scanner;

/*
 * Main application class.
 * Uses an infinite loop to simulate a real smart home system.
 */
public class SmartHomeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Thermostat thermostat = new Thermostat();

        while (true) {
            System.out.println("\n===== Smart Home Device System =====");
            System.out.println("1. Set Device Details");
            System.out.println("2. Set Temperature");
            System.out.println("3. Display Device Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Device ID: ");
                    String deviceId = sc.nextLine();

                    System.out.print("Enter Device Status (ON/OFF): ");
                    String status = sc.nextLine();

                    thermostat.setDeviceDetails(deviceId, status);
                    System.out.println("Device details saved!");
                    break;

                case 2:
                    System.out.print("Enter Temperature Setting: ");
                    int temp = sc.nextInt();

                    thermostat.setTemperature(temp);
                    System.out.println("Temperature updated!");
                    break;

                case 3:
                    System.out.println("\n--- Device Status ---");
                    thermostat.displayStatus();
                    break;

                case 4:
                    System.out.println("Exiting Smart Home System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

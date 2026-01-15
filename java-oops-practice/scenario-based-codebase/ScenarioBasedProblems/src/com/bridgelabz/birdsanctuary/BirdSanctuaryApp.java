package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

public class BirdSanctuaryApp {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Eagle");
            System.out.println("2. Add Duck");
            System.out.println("3. Add Penguin");
            System.out.println("4. Add Seagull");
            System.out.println("5. Add Ostrich");
            System.out.println("6. Display All Birds");
            System.out.println("7. Remove Bird by ID");
            System.out.println("8. Sanctuary Report");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> sanctuary.addBird(new Eagle("Eagle"));
                case 2 -> sanctuary.addBird(new Duck("Duck"));
                case 3 -> sanctuary.addBird(new Penguin("Penguin"));
                case 4 -> sanctuary.addBird(new Seagull("Seagull"));
                case 5 -> sanctuary.addBird(new Ostrich("Ostrich"));
                case 6 -> sanctuary.displayAllBirds();
                case 7 -> {
                    System.out.print("Enter Bird ID: ");
                    sanctuary.removeBirdById(sc.nextInt());
                }
                case 8 -> sanctuary.sanctuaryReport();
                case 9 -> {
                    System.out.println("Thank you for visiting BirdSanctuaryApp!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

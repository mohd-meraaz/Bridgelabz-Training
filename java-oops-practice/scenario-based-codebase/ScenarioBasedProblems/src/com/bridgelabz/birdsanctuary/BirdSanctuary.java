package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.Iterator;

public class BirdSanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void displayAllBirds() {
        for (Bird bird : birds) {
            bird.birdInfo();

            if (bird instanceof IFlyable) {
                ((IFlyable) bird).fly();
            }
            if (bird instanceof ISwimmable) {
                ((ISwimmable) bird).swim();
            }
            bird.eat();
            System.out.println();
        }
    }

    public void removeBirdById(int id) {
        Iterator<Bird> iterator = birds.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBirdId() == id) {
                iterator.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird bird : birds) {
            boolean f = bird instanceof IFlyable;
            boolean s = bird instanceof ISwimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable      : " + fly);
        System.out.println("Swimmable    : " + swim);
        System.out.println("Both         : " + both);
        System.out.println("Neither      : " + neither);
    }
}

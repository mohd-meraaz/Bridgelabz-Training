package com.bridgelabz.birdsanctuary;

public abstract class Bird {

    private int birdId;
    private String birdName;
    private String birdSpecies;
    private static int counter = 100;

    public Bird(String birdName, String birdSpecies) {
        this.birdName = birdName;
        this.birdSpecies = birdSpecies;
        this.birdId = counter++;
    }

    public abstract void eat(); // polymorphism

    public int getBirdId() {
        return birdId;
    }

    public String getBirdName() {
        return birdName;
    }

    public String getBirdSpecies() {
        return birdSpecies;
    }

    public void birdInfo() {
        System.out.println("--------------------------------");
        System.out.println("ID      : " + birdId);
        System.out.println("Name    : " + birdName);
        System.out.println("Species : " + birdSpecies);
        System.out.println("--------------------------------");
    }
}

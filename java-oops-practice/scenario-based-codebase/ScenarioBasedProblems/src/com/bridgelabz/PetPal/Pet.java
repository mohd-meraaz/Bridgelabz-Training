package com.bridgelabz.PetPal;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;

    // Constructor with random defaults
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = (int) (Math.random() * 50);
        this.energy = (int) (Math.random() * 50 + 50);
        updateMood();
    }

    // Encapsulation: private mood logic
    protected void updateMood() {
        if (hunger < 30 && energy > 60)
            mood = "Happy";
        else if (hunger > 70)
            mood = "Hungry";
        else
            mood = "Tired";
    }

    public String getMood() {
        return mood;
    }

    // Operator-based interaction logic
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
    }

    public void play() {
        energy -= 20;
        hunger += 10;
        updateMood();
    }

    public void sleep() {
        energy += 30;
        if (energy > 100) energy = 100;
        updateMood();
    }

    // Polymorphism
    abstract void makeSound();
}

package com.bridgelabz.PetPal;

public class PetPalApp {
    public static void main(String[] args) {

        Pet myPet = new Dog("Buddy", 2); 

        myPet.makeSound();
        myPet.play();
        myPet.feed();
        myPet.sleep();

        System.out.println("Pet Mood: " + myPet.getMood());
    }
}

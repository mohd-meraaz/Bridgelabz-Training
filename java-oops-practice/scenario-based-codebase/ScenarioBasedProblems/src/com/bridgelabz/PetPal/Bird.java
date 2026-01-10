package com.bridgelabz.PetPal;

class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}

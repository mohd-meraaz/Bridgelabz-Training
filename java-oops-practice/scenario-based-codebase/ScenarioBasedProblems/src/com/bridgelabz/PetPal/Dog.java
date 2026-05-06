package com.bridgelabz.PetPal;

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

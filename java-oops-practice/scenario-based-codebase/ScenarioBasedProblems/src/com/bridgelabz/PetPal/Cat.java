package com.bridgelabz.PetPal;

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

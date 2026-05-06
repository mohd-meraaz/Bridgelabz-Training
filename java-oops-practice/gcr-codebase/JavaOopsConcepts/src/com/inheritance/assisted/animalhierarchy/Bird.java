package com.inheritance.assisted.animalhierarchy;

public class Bird extends Animal {
	
	boolean canFly = true;
    Bird(String name, int age) {
        super(name, age);
    }
    Bird(String name, int age,boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
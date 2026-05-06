package com.inheritance.assisted.animalhierarchy;

public class AnimalMain {
	 public static void main(String[] args) {

	        Animal a1 = new Dog("Buddy", 3);
	        Animal a2 = new Cat("Whiskers", 2);
	        Animal a3 = new Bird("Parrot", 1);
	        Animal a4 = new Bird("Ostrich", 1,false);

	        a1.makeSound();
	        a2.makeSound();
	        a3.makeSound();
	        a4.makeSound();
	    }

}

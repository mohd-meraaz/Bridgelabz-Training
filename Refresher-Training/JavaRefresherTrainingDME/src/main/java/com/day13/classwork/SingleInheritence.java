package com.day13.classwork;

public class SingleInheritence {
    public static class Animal{
        private String name;
        private int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        private void eat() {
            System.out.println("Eating...");
        }
        public void sleep() {
            System.out.println("Sleeping...");
        }
        public void walk() {
            System.out.println("Walking...");
        }
    }

    public static class Dog extends Animal{
        public Dog(String name, int age) {
            super(name, age);
        }

        private void eat() {
            System.out.println("Dog is eating....");
        }

    }

    static void main() {
        Dog dog = new Dog("Tommy"  ,2);
        dog.eat();
        dog.walk();
        dog.sleep();
    }
}

package com.day13.classwork;

public class MultiLevelInheritance {
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

    public static class Dog extends SingleInheritence.Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        private void eat() {
            System.out.println("Dog is eating....");
        }

    }

    public static class GermanDog extends Dog {

        public GermanDog(String name, int age) {
            super(name, age);
        }
        public void breed(){
            System.out.println("German Shephard Dog..");
        }
    }

    static void main() {
        GermanDog germanDog = new GermanDog("Tommy" , 5);
        germanDog.walk();
    }


}

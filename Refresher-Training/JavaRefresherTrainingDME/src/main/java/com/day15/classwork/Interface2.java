package com.day15.classwork;

public class Interface2 {
    interface Animal {
        void eat();
    }

    interface Dog extends Animal {
        void bark();
    }

    class GermanDog implements Dog {
        @Override
        public void eat() {
            System.out.println("German Dog is eating");
        }

        @Override
        public void bark() {
            System.out.println("German Dog is barking");
        }
    }

    void main(){
        GermanDog germanDog = new GermanDog();
        germanDog.bark();
        germanDog.eat();
    }
}

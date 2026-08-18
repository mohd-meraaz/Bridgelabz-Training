package com.day13.practiceset;

public class _06StaticMethodHidingDemo {
    public class Parent {
        public static void display() {
            System.out.println("Parent called...");
        }
    }
    public class Child extends Parent {
        public static void display() {
            System.out.println("Child called...");
        }
    }
    void main(){
        Parent parent = new Parent();
        Parent parentChild = new Child();
        Child child = new Child();
        parentChild.display();
        parent.display();
        child.display();
    }
}

package com.day12.classwork;

public class VariableExample {

    public static class Car{
        static int totalCars = 0;
        String color;
        String model;
        String brand;

        public Car(String color, String model, String brand) {
            this.color = color;
            this.model = model;
            this.brand = brand;
            totalCars ++;
        }

    }

    static void main() {
        Car car1 = new Car("Red" , "M5" , " BMW" );
    }
}

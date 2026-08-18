package com.day13.practiceset;

import java.util.ArrayList;
import java.util.List;

public class _01ShapeHierarchy {
    class Shape{
        public int area(){
            return 0;
        }
    }

    public class Circle extends Shape{
        private int radius;
        public Circle(int radius){
            this.radius = radius;
        }

        @Override
        public int area(){
            return radius * radius;
        }
    }

    public class Rectangle extends Shape{
        private int width;
        private int height;
        public Rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }

        @Override
        public int area(){
            return width * height;
        }
    }

    public class Triangle extends Shape{
        private int sideLength;
        public Triangle(int length){
            this.sideLength = length;
        }
        @Override
        public int area(){
            return sideLength * sideLength;
        }

    }

     void main() {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(12);
        Rectangle rectangle = new Rectangle(8, 12);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}

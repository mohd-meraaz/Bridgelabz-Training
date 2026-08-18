package com.day13.practiceset;

public class _09MethodOverloadingRiding {
    class Shape{
        public void draw(){
            System.out.println("Drawing 1D");
        }
    }
    class Shape2D{
        public void draw(){
            System.out.println("Drawing 2D");
        }
        public void draw(String name){
            System.out.println(name + " is drawing 2D");

        }
    }

     void main() {
            Shape shape = new Shape();
            Shape2D shape2d = new Shape2D();
            shape.draw();
            shape2d.draw();
         shape2d.draw("Meraaz");

    }
}

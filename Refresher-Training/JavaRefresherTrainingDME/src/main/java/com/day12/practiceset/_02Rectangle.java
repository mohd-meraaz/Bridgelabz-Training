package com.day12.practiceset;

public class _02Rectangle {
    public static class Rectangle {

        public double width;
        public double length;

        Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        Rectangle(Rectangle rectangle) {
            this.width = rectangle.width;
            this.length = rectangle.length;
        }

        public void scale(int factor){
            length = length*factor;
            width = width*factor;

        }


    }

    static void main() {
        Rectangle rect1 = new Rectangle(4,5);
        //Rectangle rect2 = rect1;
        Rectangle rect2 = new Rectangle(rect1);
         rect2.scale(2);

        System.out.println("Rectange 1");
        System.out.println(rect1.length);
        System.out.println(rect1.width);

        System.out.println("Rectange 2");
        System.out.println(rect2.length);
        System.out.println(rect2.width);

//        System.out.println(rect2.length);
//        System.out.println(rect2.width);

    }
}

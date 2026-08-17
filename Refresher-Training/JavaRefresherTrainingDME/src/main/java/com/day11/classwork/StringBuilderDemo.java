package com.day11.classwork;

public class StringBuilderDemo {
    static void main() {
        StringBuilder sb = new StringBuilder("hello ");
        sb.append(1);
        sb.append(2);
        sb.delete(1, 3);
        System.out.println(sb.toString());
    }
}

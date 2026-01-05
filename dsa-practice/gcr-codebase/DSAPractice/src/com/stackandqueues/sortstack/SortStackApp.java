package com.stackandqueues.sortstack;

import java.util.Stack;

public class SortStackApp {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        SortStack sorter = new SortStack();
        sorter.sort(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}

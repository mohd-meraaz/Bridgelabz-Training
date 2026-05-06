package com.stackandqueues.sortstack;

import java.util.Stack;

public class SortStack {

    public void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertSorted(stack, top);
        }
    }

    private void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, value);
        stack.push(temp);
    }
}

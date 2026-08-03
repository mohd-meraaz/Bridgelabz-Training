package com.day2.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _01MaximumElement {
    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        maxStack.push(Integer.MIN_VALUE);

        for(String st : operations){
            String[] opParts = st.split(" ");
            int op = Integer.parseInt(opParts[0]);
            if(op ==1){
                int x = Integer.parseInt(opParts[1]);
                stack.push(x);
                int max = maxStack.peek();
                if(x>max){
                    maxStack.push(x);
                }
                else{
                    maxStack.push(max);
                }
            }
            else if(op ==2){
                stack.pop();
                maxStack.pop();
            }
            else if (op==3){
                res.add(maxStack.peek());
            }
        }

        return res;

    }
}

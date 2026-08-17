package com.day9.classwork;

import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) return false;
                // checking top element and removing at same time
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    // return false if not match
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

     static void main() {
        String s = "[{()[]]}]";
        System.out.println((isBalanced(s) ? "true" : "false"));
    }
}

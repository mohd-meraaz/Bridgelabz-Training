package com.day2.hackerrank;

import java.util.Stack;

public class _04BalancedParenthesis {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return "NO";
                }

                char top = st.pop();

                if (!isMatched(top, ch)) {
                    return "NO";
                }
            }
        }

        return st.isEmpty() ? "YES" : "NO";
    }

    static boolean isMatched(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}

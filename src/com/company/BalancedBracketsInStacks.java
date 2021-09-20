package com.company;

import java.util.Stack;

public class BalancedBracketsInStacks {
    public static void main(String[] args) {
        String s = "([{(a+b)+[[]]+(c+d)}])+[]{}";
        int l = s.length();
        // char a;
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println("stack is empty");
                    return;
                }
                char c = st.pop();
                switch (ch) {
                    case ')':
                        //a=st.pop();
                        if (c == '{' || c == '[') {
                            System.out.println("not balanced");
                            return;
                        }
                        break;

                    case ']':
                        //a=st.pop();
                        if (c == '{' || c == '(') {
                            System.out.println("not balanced");
                            return;
                        }
                        break;

                    case '}':
                        //a=st.pop();
                        if (c == '(' || c == '[') {
                            System.out.println("not balanced");
                            return;
                        }
                        break;
                }
            }}

            if (st.isEmpty()) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
                return;
            }
        }

}
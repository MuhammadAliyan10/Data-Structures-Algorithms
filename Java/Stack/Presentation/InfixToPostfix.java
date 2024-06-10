package Presentation;

import java.util.Stack;

public class InfixToPostfix {
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // The main function to convert infix expression to postfix expression
    static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string concatenation
        Stack<Character> stack = new Stack<>(); // Stack to hold operators and parentheses

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "a + b * (c ^ d - e) ^ (f + g * h)-i";
        System.out.println("Postfix: " + infixToPostfix(expression));
    }
}

package Presentation;

import java.util.Stack;

public class InfixToPrefix {
    // Function to return precedence of operators
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

    // Function to reverse a string
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Function to convert infix expression to prefix expression
    static String infixToPrefix(String expression) {
        // Reverse the infix expression
        expression = reverse(expression);
        Stack<Character> stack = new Stack<>();
        String result = "";

        // Replace '(' with ')' and vice versa
        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }

        expression = new String(chars);

        // Convert the modified infix expression to postfix
        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        result = reverse(result);
        return result;
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Prefix: " + infixToPrefix(expression));
    }
}

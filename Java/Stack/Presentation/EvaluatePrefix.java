package Presentation;

import java.util.Stack;

public class EvaluatePrefix {

    static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        String exp = "-+*2319";
        System.out.println("Prefix evaluation: " + evaluatePrefix(exp));
    }
}

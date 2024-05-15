package Java.Stack;

import java.util.Arrays;

public class Stack {
    static int stackValue = -1;
    static int stackArray[] = new int[100];

    public void showStackArray() {
        System.out.println(Arrays.toString(stackArray));
    }

    public void showStackIndex() {
        System.out.println(stackValue);
    }

    private void push(int number) {
        if (stackValue < stackArray.length) {
            ++stackValue;
            stackArray[stackValue] = number;
        } else {
            System.out.println("The stack is full.");
        }
    }

    private void pop() {
        if (stackValue >= 0) {
            stackValue--;
            stackArray[stackValue + 1] = 0;
        } else {
            System.out.println("No value is in the stack.");
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.showStackArray();
        stack.showStackIndex();
        stack.push(10);
        stack.showStackArray();
        stack.showStackIndex();
        stack.pop();
        stack.showStackArray();
        stack.showStackIndex();
        stack.pop();
        stack.showStackArray();
        stack.showStackIndex();
        stack.pop();
    }
}

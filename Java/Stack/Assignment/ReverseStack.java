package Assignment;

class Stack {
    private int[] stackArray;
    private int top;

    public Stack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int number) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = number;
        } else {
            System.out.println("The stack is full.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("No value is in the stack.");
            return -1;
        }

    }

    public void insertAtBottom(int value) {
        if (isEmpty()) {
            push(value);
        } else {
            int temp = pop();
            insertAtBottom(value);
            push(temp);
        }
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        int size = top + 1;
        for (int i = 0; i < size / 2; i++) {
            int temp = stackArray[i];
            stackArray[i] = stackArray[top - i];
            stackArray[top - i] = temp;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class ReverseStack {

    static void reverseStack(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Failed to reverse stack. Stack is empty.");
            return;
        }
        stack.reverse();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Original Stack:");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }

        reverseStack(myStack);

        System.out.println("\nReversed Stack:");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
    }
}

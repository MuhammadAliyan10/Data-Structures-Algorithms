public class Stack {
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

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

    }
}

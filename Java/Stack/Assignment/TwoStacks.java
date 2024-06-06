package Assignment;

public class TwoStacks {
    private int[] arr;
    private int size;
    private int top1, top2;

    // Constructor
    public TwoStacks(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) {

        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void push2(int x) {

        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    public void displayStack1() {
        if (top1 >= 0) {
            System.out.println("Stack 1 elements:");
            for (int i = top1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 1 is empty");
        }
    }

    public void displayStack2() {
        if (top2 < size) {
            System.out.println("Stack 2 elements:");
            for (int i = top2; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 2 is empty");
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(5);
        ts.push2(10);
        ts.push1(15);
        ts.push2(20);

        ts.displayStack1();
        ts.displayStack2();

        System.out.println("Popped from stack 1: " + ts.pop1());
        System.out.println("Popped from stack 2: " + ts.pop2());

        ts.displayStack1();
        ts.displayStack2();
    }
}

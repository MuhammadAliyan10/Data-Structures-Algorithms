
import java.util.Arrays;

public class DoubleStack {
    static int stackValueLeft = -1;
    static int stackArray[] = new int[100];
    static int stackValueRight = stackArray.length;

    public void showStackArray() {
        System.out.println(Arrays.toString(stackArray));
    }

    public void showStackIndex() {
        System.out.println(stackValueLeft);
        System.out.println(stackValueRight);
    }

    private void pushfromLeft(int number) {
        if (stackValueLeft < stackValueRight) {
            ++stackValueLeft;
            stackArray[stackValueLeft] = number;
        } else {
            System.out.println("No space.");
        }
    }

    private void pushfromRight(int number) {
        if (stackValueRight > stackValueLeft) {
            --stackValueRight;
            stackArray[stackValueRight] = number;
        } else {
            System.out.println("No space.");

        }
    }

    private void popOfLeft() {
        if (stackValueLeft >= 0) {
            --stackValueLeft;
            stackArray[stackValueLeft + 1] = 0;
        } else {
            System.out.println("No value in the stack.");
        }
    }

    private void popOfRight() {
        if (stackValueRight < 100) {
            stackArray[stackValueRight] = 0;
            ++stackValueRight;
        } else {
            System.out.println("No value in the stack.");
        }
    }

    public static void main(String[] args) {
        DoubleStack stack = new DoubleStack();
        stack.pushfromLeft(5);
        stack.showStackArray();
        stack.showStackIndex();
        stack.pushfromRight(4);
        stack.showStackArray();
        stack.showStackIndex();
        stack.pushfromRight(3);
        stack.showStackArray();
        stack.showStackIndex();
        stack.pushfromRight(2);
        stack.showStackArray();
        stack.showStackIndex();
        stack.popOfLeft();
        stack.showStackArray();
        stack.showStackIndex();
        stack.popOfRight();
        stack.showStackArray();
        stack.showStackIndex();
        stack.popOfRight();
        stack.showStackArray();
        stack.showStackIndex();
        stack.popOfRight();
        stack.showStackArray();
        stack.showStackIndex();

    }
}

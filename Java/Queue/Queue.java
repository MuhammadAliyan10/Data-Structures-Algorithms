import java.util.Arrays;

class QueueArray {
    int front = -1;
    int rear = -1;
    int size = 10;
    int queueArray[] = new int[size];

    void overFlow() {
        System.out.println("Queue Overflow!");
    }

    void underFlow() {
        System.out.println("Queue is empty!");
    }

    void add(int value) {
        if (rear == size - 1) {
            overFlow();
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queueArray[++rear] = value;
        System.out.println("Element Enqueued: " + value);
    }

    void remove() {
        if (front == -1 || front > rear) {
            underFlow();
            return;
        }
        int removedElement = queueArray[front++];
        System.out.println("Element Dequeued: " + removedElement);
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    int poll() {
        if (front == -1 || front > rear) {
            underFlow();
            return -1;
        }
        int removedItem = queueArray[front++];
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return removedItem;
    }

    int peek() {
        if (front == -1 || front > rear) {
            underFlow();
            return -1;
        }
        return queueArray[front];
    }

    int element() {
        if (front == -1 || front > rear) {
            throw new IllegalStateException("Queue is empty!");
        }
        return queueArray[front];
    }

    void display() {
        if (front == -1) {
            underFlow();
            return;
        }
        System.out.println(Arrays.toString(queueArray));
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.display();

        queue.remove();
        queue.display();

        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());

        queue.display();

        System.out.println("Element: " + queue.element());

        queue.remove();
        queue.remove();
        queue.remove();
    }
}

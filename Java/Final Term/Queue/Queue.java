import java.util.Arrays;

class QueueArray {
    int size = 10;
    int queueArray[] = new int[size];
    int front = 0;
    int rear = -1;

    public void overFlow() {
        System.out.println("Queue Overflow");
    }

    public void underFlow() {
        System.out.println("Queue is empty");
    }

    void add(int value) {
        if (rear == size - 1) {
            overFlow();
            return;
        }
        queueArray[++rear] = value;
        System.out.println("Element Enqueued: " + value);
    }

    void remove() {
        if (front > rear) {
            underFlow();
            return;
        }
        int removedElement = queueArray[front++];
        System.out.println("Element Dequeued: " + removedElement);
        if (front > rear) {
            front = 0;
            rear = -1;
        }
    }

    int poll() {
        if (front > rear) {
            underFlow();
            return -1;
        }
        int removedElement = queueArray[front++];
        if (front > rear) {
            front = 0;
            rear = -1;
        }
        return removedElement;
    }

    int peak() {
        if (front > rear) {
            underFlow();
            return -1;
        }
        return queueArray[front];
    }

    boolean isEmpty() {
        return (rear == -1);
    }

    void displayQueueArray() {
        if (rear == -1) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(Arrays.copyOfRange(queueArray, front, rear + 1)));
        }
    }
}

public class Queue {

    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.displayQueueArray();
        queue.remove();
        queue.remove();
        queue.displayQueueArray();
    }
}
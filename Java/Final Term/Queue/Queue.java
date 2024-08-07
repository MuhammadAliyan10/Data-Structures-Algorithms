class QueueArray {
    int size = 10;
    int queueArray[] = new int[size];
    int front = -1;
    int rear = -1;

    public void overFlow() {
        System.out.println("Queue Overflow");
    }

    public void underFlow() {
        System.out.println("Queue is empty");
    }

    void add(int value) {
        if (front == size - 1) {
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

        }
        int removedElement = queueArray[front++];
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return removedElement;
    }
}

public class Queue {

    public static void main(String[] args) {

    }

}

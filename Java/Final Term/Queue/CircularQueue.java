
class QueueArray {
    int size;
    int front = -1;
    int rear = -1;
    int[] queue;

    QueueArray() {
        this.size = 10;
        queue = new int[size];
    }

    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
    }

    void overFlow() {
        System.out.println("Queue Overflow");
    }

    void underFlow() {
        System.out.println("Queue is empty");
    }

    void add(int value) {
        if ((rear + 1) % size == front) {
            overFlow();
            return;
        } else if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = value;
    }

    void remove() {
        if (front == -1) {
            underFlow();
            return;
        }
        int removedElement = queue[front];
        System.out.println("Element Dequeued: " + removedElement);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void displayQueueArray() {
        if (front == -1) {
            underFlow();
            return;
        }
        System.out.print("Queue: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}

public class CircularQueue {
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
        queue.add(99);
        queue.displayQueueArray();
    }
}

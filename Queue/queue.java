import java.util.Scanner;

class QueueArray {
    int front = -1;
    int rear = -1;
    int size = 5;
    int queue[] = new int[size];

    void underFlow() {
        System.out.println("Queue is empty!");
    }

    void overFlow() {
        System.out.println("Queue Overflow!");
    }

    void enQueue(int element) {
        if (rear == size - 1) {
            overFlow();
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = element;
        System.out.println("Element Enqueued: " + element);
    }

    void deQueue() {
        if (front == -1 || front > rear) {
            underFlow();
            return;
        }
        int dequeuedElement = queue[front++];
        System.out.println("Element Dequeued: " + dequeuedElement);
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    void display() {
        if (front == -1) {
            underFlow();
            return;
        }
        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueArray queue = new QueueArray();

        int choice;
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to Enqueue: ");
                    int element = scanner.nextInt();
                    queue.enQueue(element);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }
}

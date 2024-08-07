class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;

    CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = head;
            head.next = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void show() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.println("The data address is " + current);
            System.out.println("The data is: " + current.data);
            System.out.println("The next address is: " + current.next);
            System.out.println("The prev address is: " + current.prev);
            System.out.println(" ");
            current = current.next;
        } while (current != head);
    }

    boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }

    void remove(int data) {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            if (current.data == data) {
                if (current == head && current == tail) { // Single element case
                    head = null;
                    tail = null;
                } else if (current == head) { // Head case
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                } else if (current == tail) { // Tail case
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else { // General case
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(10);
        list.show();
    }
}

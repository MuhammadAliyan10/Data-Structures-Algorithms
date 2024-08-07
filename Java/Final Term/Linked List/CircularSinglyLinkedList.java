class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;

    CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
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

    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            if (head == tail) { // Only one node in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node current = head;
        Node prev = null;
        do {
            prev = current;
            current = current.next;
            if (current.data == data) {
                break;
            }
        } while (current != head);

        if (current == head) {
            return;
        }
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
    }

    public void show() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.println("Data: " + current.data + ", Address: " + current + ", Next: " + current.next);
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.delete(30);
        list.show();
    }
}

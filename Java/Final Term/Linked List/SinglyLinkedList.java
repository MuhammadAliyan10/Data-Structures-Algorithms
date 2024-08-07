
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    public Node head;
    public Node tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void show() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;

            }
            current = current.next;
        }
        return false;

    }

    void delete(int data) {
        if (head == null) {
            return;

        }
        if (head.data == data) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;

        }
        previous.next = current.next;
        if (current.next == null) {
            tail = previous;

        }

    }

    int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.show();
        linkedList.delete(2);
        linkedList.show();
    }
}

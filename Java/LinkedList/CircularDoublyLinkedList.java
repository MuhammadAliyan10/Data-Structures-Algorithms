package Java.LinkedList;

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
    private Node head;
    private Node tail;

    CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public boolean search(int data) {
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

    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        do {
            if (current.data == data) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                if (current == tail) {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void show() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            System.out.println("The data address is " + current);
            System.out.println("The data is : " + current.data);
            System.out.println("The next address is : " + current.next);
            System.out.println("The prev address is : " + current.prev);
            System.out.println(" ");
            current = current.next;
        } while (current != head);
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.delete(10);
        list.show();
    }
}

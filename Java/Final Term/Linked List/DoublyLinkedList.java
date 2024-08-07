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

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    DoublyLinkedList() {
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
            newNode.prev = tail;
            tail = newNode;
        }
    }

    boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void showDataFromHead() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void showDataFromTail() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.delete(30);
        list.showDataFromHead();
    }
}

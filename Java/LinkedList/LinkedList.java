package Java.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void showNode() {
        Node current = head;
        while (current != null) {
            System.out.println("The data is " + current.data);
            current = current.next;
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;

        }
        return false;
    }

    public void delete(int data) {
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
    }

    public int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public static void main(String[] args) {

    }
}

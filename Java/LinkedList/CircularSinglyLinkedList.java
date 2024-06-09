package Java.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSinglyLinkedList {
    Node head;
    Node tail;

    CircularSinglyLinkedList() {
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
            newNode.next = head;
            tail = newNode;
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
        if (head.data == data) {
            if (head == tail) {
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

        while (true) {
            if (current.data == data) {
                break;
            }
            prev = current;
            current = current.next;
            if (current == head) {
                return;
            }
        }
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }

    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.println("The data address is " + current);
            System.out.println("The data is : " + current.data);
            System.out.println("The next address is : " + current.next);
            System.out.println(" ");

            current = current.next;
            if (current == head) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList head = new CircularSinglyLinkedList();
        head.add(10);
        head.add(20);
        head.add(30);
        head.delete(30);
        head.show();

    }

}

class SingleNode {
  data: number;
  next: SingleNode | null;

  constructor(data: number) {
    this.data = data;
    this.next = null;
  }
}

class CircularSinglyLinkedList {
  head: SingleNode | null;
  tail: SingleNode | null;

  constructor() {
    this.head = null;
    this.tail = null;
  }

  add(data: number): void {
    const newNode = new SingleNode(data);
    if (this.head === null) {
      this.head = newNode;
      this.tail = newNode;
      this.head.next = this.head;
    } else {
      this.tail!.next = newNode;
      this.tail = newNode;
      this.tail.next = this.head;
    }
  }

  delete(data: number): void {
    if (this.head === null) {
      return;
    }

    // Handle deletion of the head node
    if (this.head.data === data) {
      if (this.head === this.tail) {
        // Only one node in the list
        this.head = null;
        this.tail = null;
      } else {
        this.head = this.head.next;
        this.tail!.next = this.head;
      }
      return;
    }

    let current: SingleNode | null = this.head;
    let prev: SingleNode | null = null;

    do {
      prev = current;
      current = current!.next;
    } while (current !== this.head && current!.data !== data);

    if (current === this.head) {
      return;
    }

    if (current === this.tail) {
      this.tail = prev;
    }

    prev!.next = current!.next;
  }
}

let circularSinglyLinkedList = new CircularSinglyLinkedList();
circularSinglyLinkedList.add(1);
circularSinglyLinkedList.add(2);
circularSinglyLinkedList.add(3);
circularSinglyLinkedList.delete(3);

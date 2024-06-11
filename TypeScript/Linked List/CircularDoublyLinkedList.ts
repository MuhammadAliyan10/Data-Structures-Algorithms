class DoubleNode {
  data: number;
  next: DoubleNode | null;
  prev: DoubleNode | null;

  constructor(data: number) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class CircularDoublyLinkedList {
  head: DoubleNode | null;
  tail: DoubleNode | null;

  constructor() {
    this.head = null;
    this.tail = null;
  }

  add(data: number): void {
    const newNode = new DoubleNode(data);
    if (this.head === null) {
      this.head = newNode;
      this.tail = newNode;
      this.head.next = this.head;
      this.head.prev = this.head;
    } else {
      newNode.prev = this.tail;
      newNode.next = this.head;
      this.tail!.next = newNode;
      this.head.prev = newNode;
      this.tail = newNode;
    }
  }

  delete(data: number): void {
    if (this.head === null) {
      return;
    }

    let current: DoubleNode | null = this.head;

    do {
      if (current!.data === data) {
        if (current === this.head && current === this.tail) {
          this.head = null;
          this.tail = null;
        } else {
          if (current === this.head) {
            this.head = current.next;
          }
          if (current === this.tail) {
            this.tail = current!.prev;
          }
          current!.prev!.next = current!.next;
          current!.next!.prev = current!.prev;
        }
        return;
      }
      current = current!.next;
    } while (current !== this.head);
  }
}

let circularDoublyLinkedList = new CircularDoublyLinkedList();
circularDoublyLinkedList.add(1);
circularDoublyLinkedList.add(2);
circularDoublyLinkedList.add(3);
circularDoublyLinkedList.add(4);
circularDoublyLinkedList.delete(3);

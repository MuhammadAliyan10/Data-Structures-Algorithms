class LinkedNode {
  data: number;
  next: LinkedNode | null;

  constructor(data: number) {
    this.data = data;
    this.next = null;
  }
}

class SinglyLinkedList {
  head: LinkedNode | null;
  tail: LinkedNode | null;

  constructor() {
    this.head = null;
    this.tail = null;
  }

  add(data: number): void {
    const newNode = new LinkedNode(data);
    if (this.head === null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      if (this.tail !== null) {
        this.tail.next = newNode;
        this.tail = newNode;
      }
    }
  }

  search(data: number): boolean {
    let current = this.head;
    while (current !== null) {
      if (current.data === data) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  delete(data: number): void {
    if (this.head === null) {
      return;
    }

    if (this.head.data === data) {
      this.head = this.head.next;
      if (this.head === null) {
        this.tail = null;
      }
      return;
    }

    let current: LinkedNode | null = this.head;
    let prev: LinkedNode | null = null;

    while (current !== null && current.data !== data) {
      prev = current;
      current = current.next;
    }

    if (current === null) {
      return;
    }

    if (prev !== null) {
      prev.next = current.next;
      if (current.next === null) {
        this.tail = prev;
      }
    }
  }
  show() {
    let current = this.head;
    while (current !== null) {
      console.log(`The address of node is ${current}.`);
      console.log(`The data is ${current.data}.`);
      console.log(`The address of next node is ${current.next}.`);
      console.log(" ");

      current = current.next;
    }
  }
}

let singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.add(1);
singlyLinkedList.add(2);
singlyLinkedList.add(3);
singlyLinkedList.add(4);
singlyLinkedList.add(5);
singlyLinkedList.delete(3);
console.log(singlyLinkedList.show());

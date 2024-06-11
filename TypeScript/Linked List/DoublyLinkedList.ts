class DoublyNode {
  data: number;
  next: DoublyNode | null;
  prev: DoublyNode | null;

  constructor(data: number) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class DoublyLinkedList {
  head: DoublyNode | null;
  tail: DoublyNode | null;

  constructor() {
    this.head = null;
    this.tail = null;
  }

  add(data: number): void {
    const newNode = new DoublyNode(data);
    if (this.head === null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail!.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
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
      if (this.head !== null) {
        this.head.prev = null;
      } else {
        this.tail = null;
      }
      return;
    }

    let current: DoublyNode | null = this.head;
    while (current !== null && current.data !== data) {
      current = current.next;
    }

    if (current === null) {
      return;
    }

    if (current.next !== null) {
      current.next.prev = current.prev;
    } else {
      this.tail = current.prev;
    }

    if (current.prev !== null) {
      current.prev.next = current.next;
    }
  }

  show(): void {
    let current = this.head;
    while (current !== null) {
      console.log(`The address of node is ${current}.`);
      console.log(`The data is ${current.data}.`);
      console.log(`The address of next node is ${current.next}.`);
      console.log(`The address of previous node is ${current.prev}.`);
      console.log(" ");
      current = current.next;
    }
  }
}

let doublyLinkedList = new DoublyLinkedList();
doublyLinkedList.add(1);
doublyLinkedList.add(3);
doublyLinkedList.add(2);
doublyLinkedList.add(4);
doublyLinkedList.delete(2);
doublyLinkedList.show();

class Node:
    def __init__(self, data) -> None:
        self.data = data
        self.next = None
        self.prev = None


class CircularDoublyLinkedList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None

    def add(self, data):
        newNode = Node(data)
        if self.head is None:
            self.head = newNode
            self.tail = newNode
            self.head.next = self.head
            self.head.prev = self.head
        else:
            newNode.prev = self.tail
            newNode.next = self.head
            self.tail.next = newNode
            self.head.prev = newNode
            self.tail = newNode

    def remove(self, data):
        if self.head is None:
            return
        current = self.head
        found = False

        while True:

            if current.data == data:
                found = True
                break
            current = current.next

            if current == self.head:
                break

        if not found:
            return
        
        
        if current == self.head and current == self.tail:
            self.head = None
            self.tail = None
        elif current == self.head:
            self.tail.next = self.head.next
            self.head.next.prev = self.tail
            self.head = self.head.next
        elif current == self.tail:
            self.tail.prev.next = self.head
            self.head.prev = self.tail.prev
            self.tail = self.tail.prev
        else:
            current.prev.next = current.next
            current.next.prev = current.prev

    def totalValue(self):
        if self.head is None:
            return 0
        count = 1
        current = self.head
        while current.next != self.head:
            count += 1
            current = current.next
        return count
    
    def showCircularDoublyLinkedList(self):
        if self.head is None:
            print("The list is empty.")
            return
        current = self.head
        while True:
            print(f"Address {id(current)}")
            print(f"Data {current.data}")
            print(f"Prev Address {id(current.prev)}")
            print(f"Next Address {id(current.next)}")
            print(" ")
            current = current.next
            if current == self.head:
                break


# Test
s = CircularDoublyLinkedList()
s.add(10)
s.add(20)
s.add(30)
s.add(35)
s.add(40)
s.remove(40)
s.showCircularDoublyLinkedList()

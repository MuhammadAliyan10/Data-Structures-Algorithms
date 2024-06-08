class Node:
    def __init__(self, data) -> None:
        self.data = data
        self.next = None

class CircularSinglyLinkedList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None
    
    def add(self, data):
        newNode = Node(data)
        if self.head is None:
            self.head = newNode
            self.tail = newNode
            self.tail.next = self.head
        else:
            self.tail.next = newNode
            self.tail = newNode
            self.tail.next = self.head

    def remove(self, data):
        if self.head is None:
            return
        
        if self.head.data == data:
            if self.head == self.tail:
                self.head = None
                self.tail = None
            else:
                self.head = self.head.next
                self.tail.next = self.head
            return

        current = self.head
        prev = None

        while True:
            if current.data == data:
                break
            prev = current
            current = current.next
            if current == self.head:
                return 

        prev.next = current.next
        if current == self.tail:
            self.tail = prev

    def totalValue(self):
        if self.head is None:
            return 0
        current = self.head
        count = 1
        while current.next != self.head:
            count += 1
            current = current.next
        return count

    def showCircularSinglyLinkedList(self):
        if self.head is None:
            print("The list is empty.")
            return
        current = self.head
        while True:
            print(f"The address is {id(current)}, the value is {current.data} and the address of next node is {id(current.next)}")
            current = current.next
            if current == self.head:
                break


# Test
c = CircularSinglyLinkedList()
c.add(10)
c.add(20)
c.add(30)
c.add(40)
c.remove(10)
c.remove(40)
c.showCircularSinglyLinkedList()

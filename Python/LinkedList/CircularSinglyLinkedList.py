class Node:
    def __init__(self,data) -> None:
        self.data = data
        self.next = None

class CircularSinglyLinkedList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None
    
    def add(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        if self.tail.next == None:
            self.tail.next = self.head

    def remove(self, data):
        if self.head == None:
            return
        
        if self.head.data == data:
            self.head = self.head.next
            if self.head is None:
                self.tail = None
            return

        current = self.head 
        prev = None

        while current is not None:
            if current.data == data:
                break
            prev = current
            current = current.next

        if current is None:
            return
        
        prev.next = current.next

        if current.next is prev:
            self.tail = prev
    



    def showCircularSinglyLinkedList(self):
        current = self.head
        print(current.data)
        print(current.next)

    

             
        




c = CircularSinglyLinkedList()
c.add(10)
c.add(20)
c.add(30)
c.showCircularSinglyLinkedList()

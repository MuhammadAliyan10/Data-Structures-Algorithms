class Node:
    def __init__(self,data) -> None:
        self.data: int = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None

    def add(self, data) -> None:
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            newNode.prev = self.tail
            self.tail = newNode

    def searchLeftToRight(self,data : int) -> bool:
        current = self.head
        while current != None:
            if current.data == data:
                return True
            current  = current.next
        return False
    
    def searchRightToLeft(self,data : int) -> bool:
        current = self.tail
        while current != None:
            if current.data == data:
                return True
            current = current.prev
        return False
    
    def showLeftToRight(self) -> None:
        current = self.head
        while current != None:
            print(current.data)
            current = current.next

    def showRightToLeft(self) -> None:
        current = self.tail
        while current != None:
            print(current.data)
            current = current.prev
        
    def delete(self,data: int) -> None:
        if self.head == None:
            return
        if self.head.data == data:
            self.head = self.head.next
            if self.head != None:
                self.head.prev = None
            else:
                self.tail = None
            return
        
        current = self.head
        while current != None and current.data != data:
            current = current.next
        if current == None:
            return
        if current.next != None:
            current.next.prev = current.prev
        else:
            self.tail = current.prev
        if current.prev != None:
            current.prev.next = current.next



doublyLinkedList = DoublyLinkedList()
doublyLinkedList.add(11)
doublyLinkedList.add(12)
doublyLinkedList.add(13)
doublyLinkedList.add(14)
doublyLinkedList.showLeftToRight()
doublyLinkedList.delete(12)
doublyLinkedList.showLeftToRight()
        
        


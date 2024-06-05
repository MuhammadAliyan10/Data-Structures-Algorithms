class Node:
    def __init__(self, data):
        self.data= data
        self.next = None;

class LinkedList:
    def __init__(self):
        self.head= None;
        self.tail = None;
    def add(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode

    def showNode(self):
        current = self.head
        while current != None:
            print(f"Data: {current.data}")
            current = current.next
    def search(self, data):
        current = self.head
        while current != None:
            if current.data == data:
                return True
            current = current.next
        return False
    
    def delete(self,data):
        if self.head == None:
            return
        if self.head.data == data:
            self.head = self.head.next
            if self.head == None:
                self.tail  = None
        return None
    
    def size(self):
        current = self.head
        count = 0
        while current != None:
            count += 1
            current = current.next
        return count



linkList = LinkedList()
linkList.add(1)
linkList.add(2)
linkList.add(3)
print(linkList.delete(2))
linkList.showNode()

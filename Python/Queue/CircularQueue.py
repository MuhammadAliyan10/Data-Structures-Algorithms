class CircularQueue:
    def __init__(self,size) -> None:
        self.size: int = size
        self.front: int = -1
        self.rear : int = -1
        self.queueArray : list[int] = [0] * size
    
    def add(self, value) -> None:
        if (self.rear + 1) % self.size == self.front:
            print("Queue Overflow")
            return
        elif self.front == -1:
            self.front = 0
            self.rear = 0
        else:
            self.rear = (self.rear + 1) % self.size
        
        self.queueArray[self.rear] = value

    def remove(self) -> None:
        if self.front == -1:
            print("Queue Underflow")
            return
        self.queueArray[self.front] = 0

        if self.front == self.rear:
            self.front = -1
            self.rear = -1
        else:
            self.front = (self.front + 1) % self.size

    def showQueueArray(self) -> None:
        print(self.queueArray)



q = CircularQueue(10)
q.add(10)
q.add(20)
q.add(30)
q.showQueueArray()
q.remove()
q.remove()
q.showQueueArray()

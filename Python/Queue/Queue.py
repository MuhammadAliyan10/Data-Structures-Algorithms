class Queue:
    def __init__(self,size) -> None:
        self.front: int = -1
        self.rear: int = -1
        self.size: int = size
        self.queueArray: list[int] = [0] * size
    
    def add(self,value:int) -> None:
        if self.rear >= self.size -1:
            print("Overflow Queue.")
            return
        
        if self.front == -1:
            self.front = 0

        self.rear += 1
        self.queueArray[self.rear] = value
    
    def remove(self) -> None:
        if self.front == -1 or self.front > self.rear:
            print("Underflow Queue.")
        
        self.queueArray[self.front] = 0
        self.front += 1

        if self.front > self.rear:
            self.front = - 1
            self.rear = - 1

    def showQueueArray(self,):
        print(self.queueArray)





q = Queue(10)
q.add(10)
q.add(11)
q.add(12)
q.add(13)
q.showQueueArray()

        
    
class TwoStack:
    def __init__(self, size) -> None:
        self.size = size
        self.top1 = -1
        self.top2 = size
        self.stackArray = [0] * size

    def push1(self,value):
        if self.top1 < self.top2 -1:
            self.top1 +=1
            self.stackArray[self.top1] = value
        else:
            print("Stack overflow.")

    def push2(self,value):
        if self.top1 < self.top2 -1:
            self.top2 -=1
            self.stackArray[self.top2] = value
        else:
            print("Stack overflow.")

    def pop1(self):
        if self.top1 > -1:
            topValue =  self.stackArray[self.top1]
            self.stackArray[self.top1] = 0
            self.top1 -=1
            return topValue
        else:
            print("Stack underflow")

    def pop2(self):
        if self.top2 < self.size:
            topValue =  self.stackArray[self.top2]
            self.stackArray[self.top2] = 0
            self.top2 +=1
            return topValue
        else:
            print("Stack underflow")
            
    def showStackArray(self):
        print(self.stackArray)



s = TwoStack(10)
s.push1(10)
s.push1(20)
s.push2(10)
s.showStackArray()
s.pop1()
s.pop2()
s.showStackArray()
class Stack:
    def __init__(self,quantity):
        self.quantity = quantity
        self.top = -1
        self.stackArray = [0] * quantity
    def push(self,value):
        if len(self.stackArray) < self.top:
            return print("Stack is full.")
        self.top += 1;
        self.stackArray[self.top] = value
    def pop(self):
        if self.top >= 0:
            self.stackArray[self.top] = 0
            self.top -= 1
        else:
             print("No value in the stack to pop.")
    def peek(self):
        if self.top >= 0:
             return self.stackArray[self.top]
        else:
            print("No value in the stack to peek.")
    def isEmpty(self):
        return self.top == -1
    def showStackArray(self):
        print(self.stackArray)
    def showStackIndex(self):
        print(self.top)



stack = Stack(100);



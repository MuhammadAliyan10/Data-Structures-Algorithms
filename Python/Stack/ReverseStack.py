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
            topValue = self.stackArray[self.top] 
            self.stackArray[self.top] = 0
            self.top -= 1
            return topValue
        else:
             print("No value in the stack to pop.")


    def isEmpty(self):
        return self.top == -1
    
    
    def insertAtBottom(self,value):
        if self.isEmpty():
            self.push(value)
        else:
            temp = self.pop()
            self.insertAtBottom(value)
            self.push(temp)
    
    def reverseStack(self):
        if self.isEmpty() == False:
            temp = self.pop()
            self.reverseStack()
            self.insertAtBottom(temp)


    def showStackArray(self):
        print(self.stackArray)


class ReverseStack(Stack):
    def __init__(self):
        pass
    def reverseStack(self,stack):
        if stack.isEmpty():
            print("No value in the stack to reverse")
            return
        stack.reverseStack()


stack = Stack(10)
rv = ReverseStack()
stack.push(10)
stack.push(20)
stack.push(30)
stack.push(40)
stack.push(50)
stack.showStackArray()
rv.reverseStack(stack)
stack.showStackArray()

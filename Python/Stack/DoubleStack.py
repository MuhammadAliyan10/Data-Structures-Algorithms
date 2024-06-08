class Stack:
    def __init__(self, quantity):
        self.quantity = quantity
        self.topOfLeft = -1
        self.topOfRight = self.quantity - 1
        self.stackArray = [0] * self.quantity

    def showStackArray(self):
        print(self.stackArray)

    def showStackIndex(self):
        print(f"Left index is {self.topOfLeft} and right index is {self.topOfRight}")

    def pushFromLeft(self, value):
        if self.topOfLeft < self.topOfRight:
            self.topOfLeft += 1
            self.stackArray[self.topOfLeft] = value
        else:
            print("Stack is full.")

    def pushFromRight(self, value):
        if self.topOfRight > self.topOfLeft:
            self.topOfRight -= 1
            self.stackArray[self.topOfRight] = value
        else:
            print("The stack is full.")

    def popFromLeft(self):
        if self.topOfLeft >= 0:
            self.stackArray[self.topOfLeft] = 0
            self.topOfLeft -= 1
        else:
            print("Stack is empty from left.")

    def popFromRight(self):
        if self.topOfRight < self.quantity - 1:
            self.stackArray[self.topOfRight] = 0
            self.topOfRight += 1
        else:
            print("Stack is empty from right.")

    def isEmptyFromLeft(self):
        return self.topOfLeft == -1

    def isEmptyFromRight(self):
        return self.topOfRight == self.quantity - 1


# Example usage
stack = Stack(10)
stack.showStackIndex()
stack.pushFromLeft(1)
stack.pushFromLeft(2)
stack.pushFromLeft(3)
stack.pushFromLeft(4)
stack.pushFromLeft(5)
stack.pushFromLeft(6)
stack.pushFromRight(7)
stack.pushFromRight(8)
stack.pushFromRight(9)
stack.pushFromRight(10)
stack.pushFromRight(11)  # This should print "The stack is full."
stack.showStackIndex()
stack.showStackArray()

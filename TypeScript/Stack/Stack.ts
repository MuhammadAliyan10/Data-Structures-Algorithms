class Stack {
  private quantity: number;
  private top: number;
  private stackArray: number[];

  constructor(quantity: number) {
    this.quantity = quantity;
    this.top = -1;
    this.stackArray = new Array(this.quantity).fill(0);
  }

  showStackArray = (): void => {
    console.log(this.stackArray);
  };

  showStackIndex = (): void => {
    console.log(this.top);
  };

  push = (value: number): void => {
    if (this.top < this.quantity - 1) {
      this.top++;
      this.stackArray[this.top] = value;
    } else {
      console.log("No space in the stack.");
    }
  };

  pop = (): void => {
    if (this.top !== -1) {
      this.stackArray[this.top] = 0;
      this.top--;
    } else {
      console.log("Stack is empty.");
    }
  };
}

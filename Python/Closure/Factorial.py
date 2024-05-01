def Factorial(num:int) -> int:
    if num == 0 or num == 1:
        return 1
    return num * Factorial(num - 1)


num: int = int(input("Enter a number:  "))
if type(num) == int and num > 0:
    print(f"The factorial of the number {num} is {Factorial(num)}.")
else:
    print("Wrong input.")
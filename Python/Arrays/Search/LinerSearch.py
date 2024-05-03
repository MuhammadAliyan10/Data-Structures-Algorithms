def linerSearch(arr: list[int], searchNumber:int)->None:
    numFound: bool = False
    index: int = 0
    if arr == None or len(arr) == 0:
        return
    for i in arr:
        if i == searchNumber:
            numFound = True
            index = arr.index(i)
            break
    if numFound:
        print(f"The number {searchNumber} was found at index {index + 1}.")
    else:
        print(f"The number {searchNumber} was not found")



arr: list[int] =[32,54,43,2,4,2,5342,23,4]
linerSearch(arr, 4)
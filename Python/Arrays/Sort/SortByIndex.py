def ascendingOrder(arr:list[int]) -> None:
    for i in range(0, len(arr) -1):
        minimumNumberIndex : int = i
        for j in range( i + 1, len(arr)):
            if arr[j] < arr[minimumNumberIndex]:
                minimumNumberIndex = j
        temp: int = arr[i]
        arr[i] = arr[minimumNumberIndex]
        arr[minimumNumberIndex] = temp
    print(arr)
        

def descendingOrder(arr: list[int]) -> None:
    for i in range(0, len(arr) -1):
        maximumNumberIndex : int = i
        for j in range( i + 1, len(arr)):
            if arr[j] > arr[maximumNumberIndex]:
                maximumNumberIndex = j
        temp: int = arr[i]
        arr[i] = arr[maximumNumberIndex]
        arr[maximumNumberIndex] = temp
    print(arr)
    

arr: list[int] = [43,5,23,14,52,32,90]
ascendingOrder(arr)
descendingOrder(arr)
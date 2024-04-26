def InsertionSort(arr: list[int])->None:
    for i in range(len(arr) -1,-1,-1):
        maximumIndex:int = i
        for j in range(0,i):
            if arr[j] > arr[maximumIndex]:
                maximumIndex = j
        temp : int = arr[i]
        arr[i] = arr[maximumIndex]
        arr[maximumIndex] = temp
    
    


arr: list[int] = [32,3,52,1,4,53,2]
InsertionSort(arr)
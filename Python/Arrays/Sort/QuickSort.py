def QuickSort(arr: list[int]) -> list[int]:
    if len(arr) <= 0:
        return arr
    else:
        pivot: int = arr[len(arr)//2]
        lesser : list[int] = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        greater : list[int] = [x for x in arr if x> pivot]
        
        return QuickSort(lesser) + middle + QuickSort(greater)
    
    
arr: list[int] = [21,4,2,5,12,43]
print(QuickSort(arr))
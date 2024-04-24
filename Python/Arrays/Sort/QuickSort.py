def quickSort(arr: list[int]) -> list[int]:
    if len(arr) <= 0:
        return arr
    else:
        pivot: int = arr[0]
        lesser : list[int] = [ x for x in arr[1:] if x <= pivot]
        greater : list[int] = [x for x in arr[1:] if x>= pivot]
        
        return quickSort(lesser) + [pivot] + quickSort(greater)
    
    
arr: list[int] = [21,4,2,5,12,43]
print(quickSort(arr))
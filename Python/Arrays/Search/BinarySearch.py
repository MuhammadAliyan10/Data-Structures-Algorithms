def BinarySearch(arr:list[int], searchNumber:int)-> int:
    arr = sorted(arr)
    left : int = 0
    right: int = len(arr) -1
    while( left <= right):
        mid: int = left + (right - left) // 2
        if arr[mid] == searchNumber:
            return mid
        if arr[mid] <= searchNumber:
            left = mid + 1
        else:
            right = mid - 1
    return -1

arr: list[int] = [32,43,92,23,64,2,12,54]
index: int = BinarySearch(arr,54)
if index == -1:
    print(f"The number was not found.")
else:
    print(f"The number was found at index {index}.")

def Interpolation(arr:list[int], target:int) -> int:
    low : int = 0
    high: int = len(arr) -1
    while low <= high:
        pos:int = low + ((high -low) * (target - arr[low]) // (arr[high] - arr[low]))
        if arr[pos] == target:
            return pos
        if arr[pos] > target:
            high = pos - 1
        else:
            low = pos + 1
    return -1


arr:list[int] = [12,24,35,46,57,68,79]
print(Interpolation(arr, 12))
def mergeSort(arr: list[int]) -> None:
    if arr == None or  len(arr) <= 1:
        return
    tempArr : list[int] = [0] * len(arr) 
    sortElements(arr, tempArr, 0, len(arr) -1)

def sortElements(arr: list[int], tempArr: list[int], left : int, right: int ) -> None:
    if left < right:
        mid : int = left + (right -left) //2;
        sortElements(arr, tempArr, left, mid)
        sortElements(arr, tempArr, mid + 1, right)
        mergeValues(arr, tempArr, left, mid, right)
    
def mergeValues(arr: list[int], tempArr: list[int], left: int, mid:int, right: int) -> None:
    for i in range(left, right + 1):
        tempArr[i] = arr[i]

    i : int = left
    j : int = mid + 1
    k : int = left
    while i <= mid and j <= right:
        if tempArr[i] <= tempArr[j]:
            arr[k] = tempArr[i]
            i += 1
        else:
            arr[k] = tempArr[j]
            j += 1
        k += 1
    while i<= mid:
        arr[k] = tempArr[i]
        i += 1
        k += 1


arr : list[int] = [43,23,5,32,54,67,3]
mergeSort(arr)
print(arr)
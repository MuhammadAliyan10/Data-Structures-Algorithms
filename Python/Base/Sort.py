arr:list[int] = [36,65,3,4,265,31,2,986,32]

for i in range(len(arr)-1,-1,-1):
    for j in range(0,i):
        if arr[j] > arr[j + 1]:
            temp : int = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp


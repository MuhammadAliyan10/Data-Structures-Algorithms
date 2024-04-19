arr : list[int] = []
searchNumber : int = 0
isFound: bool = False
index : int = 0

for i in range(0, len(arr) -1):
    if arr[i] == searchNumber:
      index = i
      isFound = True


if isFound:
    print(f"The number is found at the index of {index}")
else:
    print("Not found")
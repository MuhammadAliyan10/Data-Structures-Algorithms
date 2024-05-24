## Linear Search

_Time complexity of the linear search is O(n), where n is the number of element in the array. Because the worst case the algorithm will have the check all the element in the array if the number is not in the array or if he found the target._

### Time Complexity Analysis

- _The input array has n element._
- _The loop iterates over each array._
- _In the worst case the loop runs n time(if the element is not found in the array.)_
- _The operation inside the loop (if target == arr[i]) and that return statements are constant time operations._

**Putting all together the overall time complexity of the linear search is O(n) because the loop runs n time the operation within the loop are O(1).**

### Space Complexity Analysis

- _The input array itself required O(n) space, but this is given as the part of the problem._
- _The algorithm used a fixed amount of additional space for variable (i and target) which is O(1)_

**The space complexity of this algorithm is O(1) because the additional space use by the algorithm does not depend on the input size of the array n.**

## Code

```java
 static int linearSearch(int array[], int target) {
        if (array.length == 0 || array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
```

## Binary Search

### Time Complexity Analysis

- _First sorting the array taken O(n log n) time._
- _It is because the most efficient algorithm like quick sort, merge sort operate with this time complexity._
- _Once the sorting is done the binary search takes O(log n) time._
- _Because the binary search works by repeatedly dividing the search in half_

**Since the sorting step is necessary, the overall time complexity of the function, which includes sorting and then searching is O (n log n).**

### Space Complexity Analysis

- _The space complexity of the sorting depend upon which sorting algorithm is used._
- _In Arrays.Sort(), It use quick sort which time complexity is O(log n)._
- _In binary search algorithm it takes only O(1) constant space._
- _In algorithm it use only a few variables like left, right or mid which requires constant space_

**For primitive data type the overall space complexity is O(log n) and for non primitive its O(n) for worst case**

### Result

#### Time Complexity

- **Sorting :** _O(n log n)_
- **Searching :** _O(log n)_
- **Overall :** _O(n log n)_

#### Space Complexity

- **Sorting :** _O(log n)_
- **Searching :** _O(1)_
- **Overall :** _O(log n)_

## Code

```java
   static int binarySearch(int array[], int target) {
        if (array.length == 0 || array == null) {
            return -1;
        }
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

```

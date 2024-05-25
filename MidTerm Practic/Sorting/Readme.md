## Bubble Sort

_Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted._

### Time Complexity Analysis

_The worst time complexity of bubble sort is O(n^2). The best time complexity is O(n) if its already sorted._

### Space Complexity Analysis

_The space complexity of bubble sort is O(1) constant because all the variable take constant space._

## Code

```java
    static void bubbleSort(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
```

## Insertion Sort

_Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort._

### Time Complexity Analysis

_The time complexity of insertion sort is O(n^2). As the size increases the outer loop execution increases because its start with the length and the inner loop also depend on the length of the input._

### Space Complexity Analysis

_The space complexity of insertion sort is O(1) constant because all the variable take constant space._

## Code

```java
      static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
```

## Selection Sort

_Selection Sort divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right._

### Time Complexity Analysis

_The time complexity of selection sort is O(n^2). As the size increases the outer loop execution increases because its start with the length and the inner loop also depend on the length of the input._

### Space Complexity Analysis

_The space complexity of selection sort is O(1) constant because all the variable take constant space._

## Code

```java
        static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }
```

## Merge Sort

_Merge Sort is an efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations produce a stable sort, meaning that the implementation preserves the input order of equal elements in the sorted output._

### Time Complexity Analysis

_The time complexity of merge sort is O(n log n)._

### Space Complexity Analysis

_The space complexity of merge sort is O(n)._

## Code

```java
       static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

     static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, tempArray, left, mid);
            mergeSort(array, tempArray, mid + 1, right);
            merge(array, tempArray, left, mid, right);
        }
    }

     static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
        while (j <= right) {
            array[k] = tempArray[j];
            k++;
            j++;
        }
    }
```

## Quick Sort

_Quick Sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays. A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, based on which the partition is made and another array holds values greater than the pivot value._

### Time Complexity Analysis

_The time complexity of quick sort is O(n ^ 2)._

- _The worst case occurs when the pivot chosen is always the smallest or largest element, resulting in one subarray of size 𝑛−1 and another of size 0._

### Space Complexity Analysis

_The space complexity of quick sort is O(n)._

## Code

```python
    def QuickSort(arr: list[int]) -> list[int]:
        if len(arr) <= 0:
            return arr
        else:
            pivot: int = arr[len(arr)//2]
            lesser : list[int] = [x for x in arr if x < pivot]
            middle = [x for x in arr if x == pivot]
            greater : list[int] = [x for x in arr if x> pivot]

            return QuickSort(lesser) + middle + QuickSort(greater)
```

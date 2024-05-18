# Time Complexity

### What is time complexity?

**Time complexity** _is way to represent the amount of time an algorithm takes to run as a function of length of the input.ime complexity focuses on the growth rate of the runtime as the input size increases_

### What is Big O?

_Big O is the mathematical notation used to describe the upper bound of the time complexity of an algorithm. It captures the worst-case scenario and provides high-level understanding of the algorithm's by showing how the runtime increases relative to the input size._

## Common Big O Notation

- **O(1)-Constant Time**

  - _The algorithm takes the same amount of time regardless of the input size._
  - ```java
        public int getFirstElement(int[] array) {
          return array[0];
        }

    ```

- **O(log n)-Logarithmic Time**

  - _The time increases logarithmically as the input size increases._
  - ```java
      public int sumArray(int[] array) {
        int sum = 0;
            for (int num : array) {
                sum += num;
         }
                 return sum;
        }
    ```

- **O(n)-Linear Time**

  - _TThe time increases linearly with the input size._
  - ```java
        public int binarySearch(int[] array, int target) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

    ```

- **O(n log n)-Linearithmic Time**

  - _The time complexity grows proportionally to n log n._

- **O(n^2) - Quadratic time**

  - _The time increases quadratically as the input size increases._
  - ```java
        public void printPairs(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                 System.out.println(array[i] + ", " + array[j]);
             }
            }
        }

    ```

- **O(2^n) - Exponential time**

  - _The time doubles with each addition to the input size._

- **O(n!) - Factorial time**

  - _The time grows factorially with the input size._

package Search;

//! This is an improved version of binary search, especially for uniformly distributed arrays. 
//! Instead of always dividing the array in half, interpolation search uses interpolation
//! formula to guess the position of the target element. It has an average time complexity 
//! of O(log log n) when the elements are uniformly distributed.

public class Interpolation {

    public static int interpolationSearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int pos = low + ((high - low) * (target - arr[low]) / (arr[high] - arr[low]));
            if (arr[pos] == target) {
                return pos;
            }
            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 21, 45, 50, 66, 89 };
        System.out.println(interpolationSearch(arr, 45));
    }
}

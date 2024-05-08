package Search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int arr[], int searchNum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (searchNum == arr[mid]) {
                return mid;
            }
            if (arr[mid] < searchNum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 12, 43, 53 };

        int search = binarySearch(arr, 43);
        if (search == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("The number is found at the index of " + search);
        }
    }
}

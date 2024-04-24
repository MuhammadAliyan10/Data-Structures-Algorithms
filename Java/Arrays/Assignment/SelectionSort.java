package Java.Arrays.Assignment;

import java.util.Arrays;

public class SelectionSort {

    public static void AscendingOrder(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int maximumIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maximumIndex]) {
                    maximumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maximumIndex];
            arr[maximumIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 21, 4, 32, 54, 2, 5, 6 };
        AscendingOrder(arr);
    }
}

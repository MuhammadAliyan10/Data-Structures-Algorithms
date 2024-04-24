package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void AscendingOrder(int arr[]) {
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

    public static void DescendingOrder(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxNumberIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxNumberIndex]) {
                    maxNumberIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxNumberIndex];
            arr[maxNumberIndex] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = { 43, 52, 32, 5, 67, 98, 212 };
        AscendingOrder(arr);
        DescendingOrder(arr);
    }
}

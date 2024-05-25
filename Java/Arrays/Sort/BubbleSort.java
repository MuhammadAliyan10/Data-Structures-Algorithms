package Sort;

import java.util.*;

public class BubbleSort {
    public static void AscendingOrder(int arr[]) {
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
        System.out.println(Arrays.toString(arr));
    }

    public static void DescendingOrder(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 10, 7, 8 };
        AscendingOrder(arr);

    }
}
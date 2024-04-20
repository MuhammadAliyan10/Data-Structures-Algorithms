package Sort;

import java.util.Arrays;

public class SortByIndex {
    public static void main(String[] args) {
        int arr[] = { 22, 73, 11, 54, 23, 60 };
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
        System.out.println(Arrays.toString(arr));
    }
}

package Sort;

import java.util.Arrays;

public class QuickSort {
    public static int[] AscendingOrder(int arr[]) {
        if (arr.length <= 1) {
            return arr;
        } else {
            int pivot = arr[0];
            int lesserCount = 0;
            int greaterCount = 0;

            // Counting elements lesser and greater than pivot
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= pivot) {
                    lesserCount++;
                } else {
                    greaterCount++;
                }
            }

           
            int lesser[] = new int[lesserCount];
            int greater[] = new int[greaterCount];

            lesserCount = 0;
            greaterCount = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= pivot) {
                    lesser[lesserCount++] = arr[i];
                } else {
                    greater[greaterCount++] = arr[i];
                }
            }

            // Recursively sort lesser and greater arrays
            lesser = AscendingOrder(lesser);
            greater = AscendingOrder(greater);

            // Concatenate the arrays
            int result[] = new int[arr.length];
            System.arraycopy(lesser, 0, result, 0, lesser.length);
            result[lesser.length] = pivot;
            System.arraycopy(greater, 0, result, lesser.length + 1, greater.length);

            return result;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 22, 1, 18, 11, 5, 12 };
        arr = AscendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}

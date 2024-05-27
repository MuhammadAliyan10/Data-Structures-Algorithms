import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int maximumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[maximumIndex]) {
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
        int arr[] = { 43, 52, 32, 5, 67, 98, 212 };
        selectionSort(arr);
    }
}

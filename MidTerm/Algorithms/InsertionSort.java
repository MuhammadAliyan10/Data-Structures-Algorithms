import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 55, 33, 65, 3, 56 };
        insertionSort(arr);

    }
}

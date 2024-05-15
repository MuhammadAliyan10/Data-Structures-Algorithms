package Sort;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) { // ! The base condition
            return;
        }
        int[] tempArray = new int[array.length]; // * To copy the value of the original array */
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) { // !Check at least 2 elements are in sub array..
            int mid = left + (right - left) / 2;
            mergeSort(array, tempArray, left, mid); // !This will sort left to the mis
            mergeSort(array, tempArray, mid + 1, right); // ! This will sort mid to the right
            merge(array, tempArray, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        for (int i = left; i <= right; i++) { // ! Just coping the original array value to the temp array
            tempArray[i] = array[i];
        }

        int i = left; // ? Points the the start of the left sub array
        int j = mid + 1; // ? Points the start of the right sub array
        int k = left; // ? Points to the current index of the merge array

        while (i <= mid && j <= right) { // * Until the left reaches to the mid and the mid to right */
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
        while (j <= right) {
            array[k] = tempArray[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 54, 31, 25, 87, 1, 65, 7, 5 };
        mergeSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

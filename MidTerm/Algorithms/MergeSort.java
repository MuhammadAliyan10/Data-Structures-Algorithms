public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, tempArray, left, mid);
            mergeSort(array, tempArray, mid + 1, right);
            merge(array, tempArray, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
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

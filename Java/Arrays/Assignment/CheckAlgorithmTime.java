import java.util.Random;

class Sort{
    public static void BubbleSort(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    
    }
    public static void SelectionSort(int arr[]) {
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
}



public class CheckAlgorithmTime extends Sort{
    public static int[] generateRandomNumber(int amount){
        Random random = new Random();
        int randomNumbers[] = new int[amount];
        for (int i = 0; i < amount; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        return randomNumbers;
    }

    public static void BubbleSortTimeOut(){
        long startTime = System.currentTimeMillis();
        BubbleSort(generateRandomNumber(100));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("The method bubble sort takes " + duration + "'s to sort the data.");
     
    }
    public static void InsertionSortTimeOut(){
        long startTime = System.currentTimeMillis();
        InsertionSort(generateRandomNumber(100));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("The method insertion sort takes " + duration + "'s to sort the data.");

    }
    public static void SelectionSortTimeOut(){
        long startTime = System.currentTimeMillis();
        SelectionSort(generateRandomNumber(100));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("The method insertion sort takes " + duration + "'s to sort the data.");

    }


public static void main(String[] args) {
    BubbleSortTimeOut();
    InsertionSortTimeOut();
    SelectionSortTimeOut();
}
}
package Search;

public class LinearSearch {

    public static void linearSearch(int arr[], int SearchNumber) {
        boolean numFound = false;
        int index = 0;
        if (arr.length == 0 || arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (SearchNumber == arr[i]) {
                numFound = true;
                index = i;
                break;
            }
        }
        if (numFound) {
            System.out.println("The number is found at the index of " + (index + 1));
        } else {
            System.out.println("Not found.");
        }
    }

    public static void main(String[] args) {
        int arrNum[] = { 32, 4, 2, 55, 634, 23, 2 };
        int searchNumber = 23;
        linearSearch(arrNum, searchNumber);
    }
}
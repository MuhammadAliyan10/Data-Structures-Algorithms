public class Search {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int searchNumber = 20;
        int numberFound = -1;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                index = i;
                numberFound = 1;
            }

        }
        if (numberFound == 1) {
            System.out.println("The number is found at index " + index);
        } else {
            System.out.println("The number is not found.");

        }
    }
}
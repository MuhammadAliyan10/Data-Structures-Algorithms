import java.util.*;
public class Sort{
    public static void main(String[] args){
        int arr[] = {2,5,4,2,3,4,2};
        for(int i = arr.length -1 ; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
    }
}
import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {7,8,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());

        // for(int i=1; i<arr.length; i++){
        //     int current = arr[i];
        //     int j = i-1;

        //     while(j>=0 && current < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = current;
        // }
        printArray(arr);
    }
    
}

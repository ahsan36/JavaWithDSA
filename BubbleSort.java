import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");

        }
        System.out.println();
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        //int arr[] = {7,8,3,1,2};
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
 
        for(int i=1; i<size; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //System.out.println(arr[i]+ " ");

        }
        printArray(arr);
        //System.out.println();
        
    }
    
}

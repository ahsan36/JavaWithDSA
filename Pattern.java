import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            
            numbers[i]=sc.nextInt();
        }
        boolean isAssending = true;
        
        for(int i=0; i<numbers.length-1; i++){ 
            if(numbers[i] > numbers[i+1]){
                isAssending = false;
            }
            
        }
        if(isAssending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
        
    }

}
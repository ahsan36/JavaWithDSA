public class ReverseArray {
    public static void main(String args[]){
        int arr[] = {12,45,6,8,10};
        int first = 0;
        int last = arr.length-1;


        for(int i=0; i<arr.length; i++){
            
            while(first < last){
                int temp = arr[first];
                arr[first] =arr[last];
                arr[last] = temp;

                first++;
                last--;
            }
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    
}

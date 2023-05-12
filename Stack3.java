import java.util.*;

/**Next Greater Element ->
 *    The next greater element of some element x in an array is the first greater element that
 * is to the right of x in the same array
 * arr = [6, 8, 0, 1, 3]
 * next Greater = [8, -1, 1, 3, -1]
 */

public class Stack3 {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        
        int nextGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
    
}

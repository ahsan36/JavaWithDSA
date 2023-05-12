//Prime or not
import java.util.*;
public class Pr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;

        for(i=2; i<n; i++){
            if(n %i == 0){
                System.out.println("Not a Prime");
                break;
            }
        }
        if(i == n){

            System.out.println("Prime");
        }
        
    }
    
}

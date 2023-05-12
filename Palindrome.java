import java.util.*;
public class Palindrome {
    public static void main(String args[]){
      //int n;
      // System.out.print("Enter number : ");
      // Scanner sc = new Scanner(System.in);
      // int n=sc.nextInt();
      // int m = n;

      // int reverse = 0;

      // while(n!=0){
      //   int rem = n % 10;
      //   reverse = reverse * 10 + rem;
      //   n = n / 10;
      // }
      // //System.out.println(reverse);
      // if(reverse == m){
      //   System.out.println("Palindrome");
      // }
      // else{
      //   System.out.println("Not Palindrome");
      // }

      System.out.print("Enter number : ");
      Scanner sc = new Scanner(System.in);
      String n=sc.nextLine();
      int m = n.length();
      for(int i = 0; i< m / 2; i++){
        if(n.charAt(i) == n.charAt(m-i-1)){
          System.out.println("Palindrome");
        }
        else{
          System.out.println("Not Palindrome");
        }
      }

      
      
    }
    
}

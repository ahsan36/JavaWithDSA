import java.util.*;
public class First{

    public static int printFib(int n1,int n2,int count){
        
        int n3;
        for(int i= 1; i<count; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 =n2;
            n2=n3;

        }
        return 1;

    }

    public static void main(String args[]){
        int n1 =0 , n2 = 1;
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        System.out.print(n1+" "+n2);
        printFib(n1,n2,count);


        
    }
}


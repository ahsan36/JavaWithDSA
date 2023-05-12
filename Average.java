import java.util.*;
public class Average {
    
    int Calculate(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average ag = new Average();

        System.out.println("Avg : " +ag.Calculate(a,b,c));
    }
    
}

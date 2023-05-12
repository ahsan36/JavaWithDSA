 //Ques. Find number of way to reach from (0,0) to (N-1, M-1) in a N*M grid.Allowed moves --- right or down
//Time Complexity --- O(n+m)
public class Backtracking3 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }
    public static int facti(int m){
        if(m==0){
            return 1;
        }
        int factori = m*facti(m-1);
        return factori;
    }
    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 && i==m-1){
            return 1;
        }
        else if(j==n || j==m){
            return 0;
        }
        int w1 = fact((n-1)+(m-1));
        int w2 = (fact(n-1))*(fact(m-1));
        int w3 = w1/w2;
        // int w1 = gridWays(i+1, j, n, m);
        // int w2 = gridWays(i, j+1, n, m);
        return w3;
    }
    public static void main(String args[]){
        int n=3, m=3;
        // System.out.println(fact(n));
        // System.out.println(facti(m));
        System.out.println(gridWays(0, 0, n, m));
    }
}

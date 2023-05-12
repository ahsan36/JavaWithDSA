//Ques. Find number of way to reach from (0,0) to (N-1, M-1) in a N*M grid.Allowed moves --- right or down
//Time Complexity --- O(2^n+m)
public class Backtaracking2 {
    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 && i==m-1){
            return 1;
        }
        else if(j==n || j==m){
            return 0;
        }
        
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));        
    }
    
}

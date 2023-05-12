import java.util.*;
public class Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size : ");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter numbers : ");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The spiral order matrix is : ");
        
        int rowStart = 0;
        int rowEnd = n-1;
        int columnStart = 0;
        int columnEnd = m-1;

        while(rowStart <= rowEnd && columnStart <= columnEnd){
            for(int col = columnStart; col <= columnEnd; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
            for(int row = rowStart; row <= rowEnd; row++){
                System.out.print(matrix[row][columnEnd]  + " ");
            }
            columnEnd--;

            for(int col = columnEnd; col >= columnStart; col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for(int row = rowEnd; row >= rowStart; row--)
            {
                System.out.print(matrix[row][columnStart] + " ");

            }
            columnStart++;

            System.out.println();

        }


    }
    
}

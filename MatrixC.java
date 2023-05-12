import java.util.*;
public class MatrixC {
    public static void spiralMatrix(int matrix[][]){
        int rowStart =0;
        int rowEnd = matrix.length-1;

        int colStart = 0;
        int colEnd = matrix.length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int col = colStart; col<=colEnd; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            for(int row = rowStart; row<=rowEnd; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            for(int col = colEnd; col>=colStart; col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for(int row = rowEnd; row>=rowStart; row--){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            
        }
        System.out.println();

    }
    public static void main(String args[]){
       int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};  
       
        spiralMatrix(matrix);      
        
    }
    
}

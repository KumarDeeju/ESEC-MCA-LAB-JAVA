import java.util.Scanner;

public class reverseSpiral {
    public static void spiralMatrix(int rows, int cols, int rStart, int cStart){
        int[][] matrix = new int[rows][cols];
        int strRow = rStart, endRow = strRow+1;
        int strCol = cStart, endCol = strCol+1; 
        // strRow = 1
        // strCol = 4
        int num = 1;
        while (strRow <= endRow && strCol <= endCol) {
            
            for(int j=strCol;j<=endCol;j++){
                
                matrix[strRow][j] = num; 
                num++;
               
            }
            for(int i=strRow;i<=endRow;i++){
                matrix[i][endCol] = num;
                num++;
            }
            for(int j=endCol-1;j>=strCol;j--){
                matrix[endRow][j] = num;
                num++;
            }
            for(int i=endRow;i>=strRow;i--){
                matrix[i][endCol] = num;
                num++;
            }
            strCol--;
            strRow--;
            endCol++;
            endRow++;
           
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int rStart = sc.nextInt();
        int cStart = sc.nextInt();

        spiralMatrix(rows, cols, rStart, cStart);
    }
    
}

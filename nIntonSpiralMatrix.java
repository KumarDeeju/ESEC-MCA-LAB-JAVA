public class nIntonSpiralMatrix{
    public static void spiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int strRow = 0, endRow = matrix.length-1;
        int strCol = 0, endCol = matrix[0].length-1;
        int num = 1;
        while (strRow <= endRow && strCol <= endCol) {

            for(int j=strCol;j<=endCol;j++){
                matrix[strRow][j] = num; num++;
            }
            for(int i=strRow+1;i<=endRow;i++){
                matrix[i][endCol] = num; num++;
            }
            for(int j=endCol-1;j>=strCol;j--){
                if(strRow == endRow) break;
                matrix[endRow][j] = num;num++;
                        
            }
            for(int i=endRow-1;i>=strRow+1;i--){
                if(strCol == endCol) break;
                matrix[i][strCol] = num;num++;
                        
            }
            strRow++;
            strCol++;
            endCol--;
            endRow--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 3;
        spiralMatrix(n);
        
    }
}
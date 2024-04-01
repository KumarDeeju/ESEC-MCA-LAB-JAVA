import java.util.Scanner;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int determinant = 0;
        if(r == 2 && c == 2){
            determinant = ((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]));
        }else{
            int x = ((arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]));
            int y = ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]));
            int z = ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0]));

            determinant = ((arr[0][0] * x) - (arr[0][1] * y) + (arr[0][2] * z));
        }
        System.out.println("Determinant of matrix ="+determinant);
    }
}

import java.util.Scanner;
/*
 4444444
 4333334
 4322234
 4321234
 */

public class PatternDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int num = n;
            for(int j=1;j<=(n*2)-1;j++){
                //  if(i==1||j==(n*2)-1 || j == 1){
                    System.out.print(num);
                   if(i>=1&&j<i){
                    num--;
                   }
                   if(j>=2*n-2-i){
                    num++;
                   }
                 }
                 System.out.println();
            }
        }
    }

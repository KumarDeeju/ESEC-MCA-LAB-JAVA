import java.util.Scanner;
public class SquarNo {
    static int findSqrt(int x){
       return (int) Math.sqrt(x);
        
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(findSqrt(x));
         
    }
}

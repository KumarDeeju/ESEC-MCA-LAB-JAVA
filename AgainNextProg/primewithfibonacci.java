package AgainNextProg;

import java.util.ArrayList;
import java.util.Scanner;

public class primewithfibonacci {
    static String findPrimewithFibonacci(String st){
        List<Integer> primeNo = new ArrayList<>();
        List<Integer> FibonacciNo = new ArrayList<>();
        int num = 2;
        

        private static boolean isPrime(int num){
            if(num <= 1){
                return false;
            }
            for(int i=1;i<=num;i++){
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String st = sc.nextLine();
            String result = findPrimewithFibonacci(st);
            System.out.print(result);
        }
    }
}

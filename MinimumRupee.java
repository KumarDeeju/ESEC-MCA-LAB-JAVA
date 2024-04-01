import java.util.Scanner;

public class MinimumRupee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int money = sc.nextInt(); // 575
            int count=0;
            int[] arr = {500, 100, 50, 20, 10, 5, 2, 1};
            
            for(int j=0;j<arr.length;j++){
                if(arr[j] <= money){
                
                 money = money % arr[j];
                 count++;
                 System.out.println(arr[j]+": "+count);
            }else{
                System.out.println(arr[j]+": "+count);
            }
            count = 0;
        }
       }
}   }

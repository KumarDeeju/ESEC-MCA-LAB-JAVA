import java.util.Scanner;

public class sumThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // arr = [1, 2, 3, 4, 5, 9]
        // ind =  0  1  2  3  4  5
        int ans = 0;
        for(int i=0;i<arr.length;i++){ // arr[i] = [1] >> i = 0
            for(int j=i+1;j<arr.length;j++){ // arr[j] = [2] >> j = 1
                for(int k=j+1;k<arr.length;k++){ // arr[k] = [3]

                        int sum = arr[i] + arr[j] + arr[k];
                        if(sum > ans){
                            ans = sum;
                            System.out.print(ans+" ");
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

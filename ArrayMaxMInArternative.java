import java.util.Scanner;
public class ArrayMaxMInArternative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int temp=0;
            int mid = arr.length / 2;
            // 1 2 3 4 5 6 7
            for(int i=0;i<mid;i++){
                for(int j=arr.length-1;j>=mid;j--){
                    if(arr[i] < arr[j]){

                        temp = arr[i]; // 1 2 3
                        arr[i] = arr[j]; // 7 6 5
                        arr[i+1] = temp; // 1 2 3
                        // System.out.print(arr[i]+" "+arr[i+1]+" ");                                                                                                                                                                                                                                                                                    
                    }
                }
                 }
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }
            }
        }
import java.util.Scanner;
import java.util.Arrays;
public class StringCheckEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        String str="";
        sc.nextLine();
        for(int i=0;i<n;i++){
            str = sc.nextLine();
            String[] Finl = str.split(" ");
            int mid = str.length() / 2;
            String s1 = str.substring(0, mid);
            String s2 = str.substring(mid+1, str.length());
            char[] c1 = s1.toCharArray(); 
            char[] c2 = s2.toCharArray(); 
            // System.out.print(s1.equals(s2));
            Arrays.sort(c1);
            Arrays.sort(c2);
            int j=0;
            for(int k=0;k<c1.length;k++){
                if(c1[k] == c1[j]){
                    j++;
                    System.out.print("True");
                }else{
                    System.out.print("False");
                }
            }
        }
        
    }
}

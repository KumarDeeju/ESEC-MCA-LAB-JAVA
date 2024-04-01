
import java.util.Scanner;

public class ArrangeTheCharactor {
    static String printTheShufleString(String str, int[] arr){
        int len = str.length();
        char[] ch = new char[len];
        for(int i=0;i<len;i++){
            ch[arr[i]] = str.charAt(i);
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(printTheShufleString(str, arr));
    }
}

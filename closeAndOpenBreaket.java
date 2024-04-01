import java.util.Scanner;
import java.util.Stack;

public class closeAndOpenBreaket {
    static boolean makeGood(String str){
        Stack<Character> sb = new Stack<Character>();
       for(Character c : str.toCharArray()){
        if(c == '(' || c == '{' || c == '['){
            sb.push(c);
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       System.out.println(makeGood(str));
        
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeetingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
       }
       int ans = -1;
       for(int i=0;i<s.length();i++){
        char ck = s.charAt(i);
        if(map.containsKey(ck)){
            if(map.get(ck) == 1){
                ans = i+1;
                break;
            }
        }
       }
       System.out.println(ans);
    }
}

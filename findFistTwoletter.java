import java.util.Scanner;
import java.util.*;
public class findFistTwoletter {
        static String printSmallDigt(String st, int k){
      int digit = st.length()-k;
      if(st.length() <= k) return "0";
      int top = -1, start = 0;
      char[] c = st.toCharArray();
      for(int i=0;i<c.length;i++){
            while(top >= 0 && c[top] > c[i] && k > 0){
                top--;
                k--;
            }
            top++;
            c[top] = c[i];
      }
      while(start <= top && c[start] == '0') start++;
      String ans = "";
      for(int i=start;i<digit;i++){
        ans = ans + c[i];

    }
    if(ans.equals("")) return "0";
    return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int k = sc.nextInt(); // 1432291
        System.out.println(printSmallDigt(st, k));
    }
}
/*
 *INPUT- 1432219 
INPUT(K)- 3
OUTPUT(smalest)- 1219

INPUT- 10
INPUT(K)- 2
OUTPUT(smallest)- 0
 */
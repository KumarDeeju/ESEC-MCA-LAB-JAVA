import java.util.HashSet;

public class PalindromLength { 

    static int printPalindromlength(String st){
        int[] arr = new int[128];
        for(char ch : st.toCharArray()){
            arr[ch]++; // 1
        }
        int aa = 0;
        for(int i=0;i<128;i++){
            int val = arr[i];
            aa += (val/2)*2;
            if(aa % 2 == 0 && val % 2 == 1){
                aa++;
            }
        }
        return aa;
    }
    public static void main(String[] args) {
        String st = "aabb";
      int ans = printPalindromlength(st);
     System.out.println(ans);
    }
}

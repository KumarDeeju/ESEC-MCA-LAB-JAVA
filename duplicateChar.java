import java.util.HashMap;
import java.util.HashSet;

public class duplicateChar {
  public static void removeDuplicate(String str){
    HashMap<Character, Integer> abc = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for(char ch : str.toCharArray()){
        if(abc.push(ch,1)){
            sb.append(ch);
        }
    }

  }
    public static void main(String[] args) {
        String str = "Arjunarjun";
        removeDuplicate(str);
    }
}

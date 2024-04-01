// import java.util.Set;
import java.util.*;

public class uniqueChar{
    public static void main(String... args){
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char ch : str.toCharArray()){
            unique.add(ch);
        }
        System.out.println(unique.size());
    }
}
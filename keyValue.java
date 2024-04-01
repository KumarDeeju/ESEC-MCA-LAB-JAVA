import java.util.HashMap;
import java.util.Map;

public class keyValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rahul", 22);
        map.put("Rakesh", 20);
        map.put("Amit", 21);
        map.put("Prakash", 22);
        map.put("Arjun", 25);

        // System.out.println(map.get("Amit"));
        // System.out.println(map.remove("Prakash", 22));
        // System.out.println(map.size());
        // System.out.println(map.containsKey("Prakash"));
        // System.out.println(map.replace("Arjun", 25, 29));
        // System.out.println(map.get("Arjun"));
        
        for(String ans : map.keySet()){
            System.out.println(ans);
        }
    }
}

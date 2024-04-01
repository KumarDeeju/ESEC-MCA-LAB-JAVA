import java.util.List;

public class strimfilter {
    public static void main(String[] args) {
        List<String> strs = List.of("rahul", "main bihar se hun", "mental", "goo", "mujhe ghar jana h","tum kya karte ho", "yaha kya kr rahe ho");

           String result =  strs.stream()
                .filter(str -> str.length() > 7).reduce("", (a, b) -> a + " " + b);
                // here filter to size of string if 7 of greater length then print that string

                System.out.println(result);
    }
}

import java.util.Optional;

public class optional {

    public static Optional<String> upperPrint(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
    public static void main(String[] args) {
        System.out.println(upperPrint(null)); //Optional.empty
        System.out.println(upperPrint("")); // Optional.empty
        System.out.println(upperPrint("arjun")); //Optional[ARJUN]
    }
}

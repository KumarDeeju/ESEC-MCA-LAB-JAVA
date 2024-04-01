import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Ezhil", "Rahul", "Aman", "Ajju");
        names.stream()
            .forEach(name -> System.out.println(name));
    }
}

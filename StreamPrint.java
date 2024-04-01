import java.util.List;

public class StreamPrint {
    public static void main(String[] args) {
        List<String> strs = List.of("Giggy","hello","howing");

        strs.stream()
            .forEach(str -> System.out.println(str));
    }
}

import java.util.stream.IntStream;

public class factorial1 {
    public static void main(String[] args) {
        int num = 5;

        IntStream.rangeClosed(2, num)
            .reduce((a, b) -> a * b)
            .ifPresent(System.out::println);
    }
}

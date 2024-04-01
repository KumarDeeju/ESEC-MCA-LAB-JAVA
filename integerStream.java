import java.util.List;

public class integerStream {
    public static void main(String[] args) {
        // List<Integer> list = List.of(11, 23, 12, 34, 56, 10, 19, 7, 33);
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
            .filter(num -> num % 2 == 1) // for odd number
            .forEach(num -> System.out.println(num));
    }
}

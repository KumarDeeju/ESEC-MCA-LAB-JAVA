import java.util.*;
public class methodReference {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
            .filter(num -> num % 2 == 1)
            // .forEach(num -> System.out.println(num));
            .forEach(System.out::println);

    }
}

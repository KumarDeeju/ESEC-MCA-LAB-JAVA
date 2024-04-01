import java.util.List;
import java.util.Optional;

public class opetionalTethodReference {
    public static void main(String[] args) {
        // List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> num = List.of(); // empty hai

        Optional<Integer> newSum = num.stream()
                .reduce((a, b) -> a + b); 
        if (newSum.isPresent()) { // here Optional class check the element are present or not
            System.out.println(newSum.get());
        } else {
            System.out.println("List is Empty");
        }
    }
}
// Output : List is Empty

import java.util.List;

public class streamSet {
    public static void main(String[] args) {
        List<String> list = List.of("Rahul", "Rakes", "Manav");
        // lemda function to print
        list.stream()
            .forEach(name -> System.out.println(name));
                
    }
}

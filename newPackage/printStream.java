package newPackage;

import java.util.List;

public class printStream {
    public static void main(String[] args) {
        List<String> str = List.of("Rajesh","SUmit","raghav","Manoj");

        str.stream()
            .forEach(strs -> System.out.println(strs));
    }
}

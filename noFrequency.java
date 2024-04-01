// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class noFrequency {
    public static void main(String[] args) {
        List<Integer> myList =  Arrays.asList(2, 4, 3, 2, 4, 5, 9, 5, 5, 3);
        System.out.println(Collections.frequency(myList, 2));
    }
}

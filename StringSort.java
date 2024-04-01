// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
import java.util.*;

public class StringSort {
   

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Rahul", "Amit", "Arjun", "Ankit");
        System.out.println(myList);
        printSortedList(myList);
        System.out.println(myList);
    }

   /**
     * @param myList
     */
     public static void printSortedList(List<String> myList) {
        Collections.sort(myList);
    }
}

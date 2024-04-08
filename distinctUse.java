import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class distinctUse {
    public static void removeDuplct(int[] arr){
        List<Integer> number = new ArrayList<>();
        for (Integer integer : arr) {
            number.add(integer);
        }
        System.out.println(number);
        // remove duplicate and convert in the list
        List<Integer> result = number.stream().distinct().toList();
        // List<Integer> result = number.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplct(arr);
    }
}
//  arr size - 6
// arr - 2 4 2 7 2 2
// ArratList - [2, 4, 2, 7, 2, 2]
// OUTPUT without duplicate in the ArrayList [2, 4, 7]
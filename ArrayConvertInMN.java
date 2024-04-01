import java.util.Scanner;

public class ArrayConvertInMN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // String str = sc.nextLine();
        String str = "{{1,2,3,4},{3,4,5,6}}";
        String[] st = str.split("\\},\\{+"); // <<<<< ",(?=[^\\}]*(?:\\{|$))" >>>>>
        for(String ans : st){
            System.out.print(ans);
        }
    }
}

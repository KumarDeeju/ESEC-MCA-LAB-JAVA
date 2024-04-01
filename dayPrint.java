import java.util.Scanner;
public class dayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.err.println("tuesday");
                break;
            default:
                System.out.println("kd");
        }
    }
}

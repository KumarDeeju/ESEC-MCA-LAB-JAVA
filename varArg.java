public class varArg {

    public static int sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String... args) {
        System.out.print(sum(2, 1, 4, 5, 6, 7));
    }
}

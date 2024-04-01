package newPackage;

public class testingfunctionInterface {
    public static void main(String[] args) {
        functionInterface function = num -> {
            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(function.isfunctionInterface(5));
    }
}

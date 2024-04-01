import java.util.function.BinaryOperator;
public class lemdaMultiple{
    public static void main(String[] args){
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(4, 8);
        System.out.println(result);
    }
}
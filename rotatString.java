import java.util.Scanner;
public class rotatString{
    static void findString(String st, String sr){
        if(st.length()==sr.length() && (st + st).contains(sr)){
            System.out.println(st+" and "+sr+" are rotation of each other");
        }else{
            System.out.println(st+" and "+sr+" Not Rotation of each other");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String sr = sc.next();
        findString(st, sr);

    }
}
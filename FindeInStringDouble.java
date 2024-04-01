import java.util.Scanner;

public class FindeInStringDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 0;
        char c = '.';
        String sp = st.replaceAll("[0-9]", "");
        String[] sr = sp.split(" ");
        for(int i=0;i<sp.length();i++){
            if(sp.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}

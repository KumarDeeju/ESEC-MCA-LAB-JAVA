import java.util.Scanner;

public class StringPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int count1=0,count2=0,count3=0,count4=0;
        for(int i=0;i<st.length();i++){
           char ch = st.charAt(i);

                if((ch >= 'A')&&(ch <= 'Z')){
                    count1++;
                }else if(ch >= 'a' && ch <= 'z'){
                    count2++;
                }else if(ch >= '0' && ch <= '9'){
                    count3++;
                }else if((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)){
                    count4++;
                }
        }
        if(st.length() >= 8){
            if(count1 >= 1 && count2 >= 1 && count3 >= 1 && count4 >= 1){
                System.out.print("Password is strong");
            }else{
                System.out.println("Password is not Strong");
            }
            }else{
                System.out.println("Password is not Strong");
            }
    }
}

public class compairtString {
   

    public static void main(String[] args) {
        String str1 = "abcd";
       for(int i=0;i<str1.length();i++){
        for(int j=i+1;j<=str1.length();j++){
 
            System.out.print(str1.substring(i,j)+" ");
        }
       }
    }
}

public class StringCopair{
    static void findOccOfIndex(String st, String sr){
        int len1 = st.length();
        int len2 = sr.length();
        if(st.length() < sr.length()){
            return;
        }
        for(int i=0;i<len1-len2+1;i++){
            if(st.charAt(i) != sr.charAt(0)){
                if(st.substring(i, sr.length()+i).equals(sr)){

                    System.out.print(i);
                }
            }
        }
        return;
    } 
    public static void main(String[] args) {
        String st = "leetcode";
        String sr = "leeto";
        findOccOfIndex(st, sr);
    }
}
public class powerCheckOF3 {
    public static boolean checkPowr(int n){
    //    while(n >= 3){
    //         if(n % 3 != 0) return false;
    //         n /=3;
    //    }
    //    return n == 1;
    while (n > 0){
        if(n % 3 != 0 && n != 1){
            return false;
        }
        n /= 3;
    }
    return true;
    }
    public static void main(String[] args) {
        int n = 27;
        System.out.println(checkPowr(n));   
    }
}

public class subArray {
    public static int printSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i=0;i<arr.length;i++){
            cur += arr[i];// -2,
            // if(cur < 0){
            //     cur = 0;
            // }
            cur = Math.max(arr[i], cur);
            max = Math.max(max, cur);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(printSubArray(arr));
    }
}

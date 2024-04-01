public class findminiAndMax {
    public static int findMaxMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i=0;
        while (i < arr.length) {
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int i=0;
        while (i < arr.length) {
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {34, 12, 67, 44, 89, 30, 45};
        System.out.println(findMaxMin(arr)+" ");
        System.out.println(findMax(arr));
    }
}

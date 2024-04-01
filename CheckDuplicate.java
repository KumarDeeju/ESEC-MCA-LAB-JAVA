import java.util.HashSet;

public class CheckDuplicate {

    public static boolean checkDup(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for(int ans : arr){
            if(st.contains(ans)){
                return true;
            }else{
                st.add(ans);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 5};
        System.out.println(checkDup(arr));
    }
}
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */
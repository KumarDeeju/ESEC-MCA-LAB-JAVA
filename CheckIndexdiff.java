import java.util.HashMap;

public class CheckIndexdiff {
    static boolean CheckDiffOfk(int[] arr, int k){
        if(k == 0) return false;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           int val = arr[i];
           if(mp.containsKey(val) && i - mp.get(val) <= k){
            return true;
           }
           mp.put(val, i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 1};
        int k = 3;
        System.out.println(CheckDiffOfk(arr, k));
    }
}
/* 219. Contains Duplicate II
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

 */
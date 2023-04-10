import java.util.HashMap;

/*
Given an integer array nums and an integer k,
return true if there are two distinct indices i and j in the array such that
nums[i] == nums[j] and abs(i - j) <= k.

Input: nums = [1,2,3,1], k = 3
Output: true

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class Main {
    public static void main(String[] args) {

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                
            }
            map.put(nums[i],i);
        }
    }
}

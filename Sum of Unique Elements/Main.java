/* You are given an integer array nums.
The unique elements of an array are the elements that appear exactly once in the array.
 Return the sum of all the unique elements of nums.

 Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2};
        System.out.println(uniqueNumber(nums));
    }
    public static int uniqueNumber(int nums[]){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count==1) sum += nums[i];
        }
        return sum;
    }
}

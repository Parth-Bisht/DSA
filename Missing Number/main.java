/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number in the range since it does not appear in nums.
 */
public class main {
    public static void main(String[] args) {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int output = missigNumber(nums);
        System.out.println(output);
    }
    public static int missigNumber(int[] nums){
        int n = nums.length;
        int sum  = n*(n+1)/2;
        for(int i: nums) sum -= i;
        return sum;
    }
}

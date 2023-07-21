/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
 */
public class main {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,3,4,2};
        int output = duplicateNumber(nums);
        System.out.println(output);
    }
    public static int duplicateNumber(int[] nums){
        int tortoise = nums[0];
        int hare = nums[nums[0]];

        while(tortoise!=hare){
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        tortoise = 0;
        while(tortoise!=hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return tortoise;
    }
}

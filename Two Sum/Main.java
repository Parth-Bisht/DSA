
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,5};
        int target = 10;

//        int[] ans = twoSum(nums,target);
//        System.out.println(Arrays.toString(ans));
        int[] ans = twoPointer(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoPointer(int nums[], int target){
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target) {
                return new int[]{i,j};
            }
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}

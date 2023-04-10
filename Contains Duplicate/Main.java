/*
Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

 Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,2,3,1]
Output: true
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
        if(nums==null || nums.length==0) return false;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i: nums){
            if(!set.add(i)) return true;
        }
        return false;
    }
}
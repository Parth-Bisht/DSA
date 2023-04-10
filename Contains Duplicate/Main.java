/*
Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = 
    }
    public static boolean containsDuplicate(int[] nums){
        if(nums==null || nums.length==0) return false;
        HashSet<int[]> set = new HashSet<>();

        for(int i: nums){
            if(!set.add(nums)) return true;
        }
        return false;
    }
}

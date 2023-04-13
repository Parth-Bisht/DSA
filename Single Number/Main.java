/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};
        System.out.println(singleNumber(numbers));
        System.out.println(xorfunction(numbers));
    }

    public static int singleNumber(int[] numbers){
        Map<Integer,Boolean> map = new HashMap<>();

        for(int number: numbers){
            map.put(number,!map.getOrDefault(number,false));
        }
        for(Map.Entry<Integer,Boolean> entry: map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int xorfunction(int[] numbers){
        int res = 0;
        for(int x: numbers){
            res ^= x;
        }
        return res;
    }
}

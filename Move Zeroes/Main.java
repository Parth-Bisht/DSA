/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

import java.util.Arrays;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        arr = new int[]{0, 1, 2, 3, 0,4};
        moveZeroes();
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(){
        int i = 0, j=0;
        while(j<arr.length){
            if(arr[j]==0) j++;
            else{
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }
    }
}

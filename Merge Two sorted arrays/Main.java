/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.


Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        int m=3, n = 3;
        System.out.println(merge(nums1,m,nums2,n));
    }

    public static List<Integer> merge(int[] nums1, int m, int[] nums2, int n){
        List<Integer> temp = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i<m || j<n){
            if(nums1[i]<=nums2[j]) temp.add(nums1[i++]);
            else temp.add(nums2[j++]);
        }
        while(i<m) temp.add(nums1[i++]);
        while(j<n) temp.add(nums2[j++]);
        return temp;
    }
}

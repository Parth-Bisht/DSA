import java.util.ArrayList;
import java.util.Arrays;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear
as many times as it shows in both arrays and you may return the result in any order.

Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
public class main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] out = intersect(nums1,nums2);
        System.out.println(Arrays.toString(out));
    }
    public static int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> temp = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            } else if (nums2[j]<nums1[i]) {
                j++;
            }else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] output = new int[temp.size()];
        int k=0;
        while(k<temp.size()){
            output[k] = temp.get(k);
            k++;
        }
        return output;
    }
}

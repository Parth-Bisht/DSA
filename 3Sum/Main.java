import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k,and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
//        int[] nums = new int[] {0,1,1};
//        int[] nums = new int[] {0,0,0};
        System.out.println(revised(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort((nums));
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length - 1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(k>j && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                } else if (sum<0) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> revised(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j<k && arr[j]==arr[j+1]) j++;
                    while(k>j && arr[k]==arr[k-1]) k--;
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}

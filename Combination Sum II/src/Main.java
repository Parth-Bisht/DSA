import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a collection of candidate numbers (candidates) and a target number (target),
find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static List<List<Integer>> combinationSum(int[] nums,int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list,List<Integer> temp,int[] nums,int target,int start){
        
    }
}
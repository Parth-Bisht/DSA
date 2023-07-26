import java.util.*;

/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

 Example:
 Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
 */
public class main {
    public static void main(String[] args) {

    }
    public static List<String> summaryRanges(int[] nums){
        List<String> output = new ArrayList<>();
        int start,end;
        int i=0;
        while(i<nums.length){
            start = nums[i];
            while(i< nums.length && nums[i+1]==nums[i]+1) i++;
            end = nums[i];
            if(start==end) output.add(start+"");
            else output.add(start+"->"+end);
            i++;
        }
        return output;
    }
}

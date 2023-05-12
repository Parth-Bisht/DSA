/*
Sample Input:
4 3
1 8 9
2 7 10
3 6 11
4 5 12

Sample Output:
4 3 2 1 5 6 7 8 12 11 10 9
 */

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{8,7,6,5},{9,10,11,12}};
        int N = nums.length;
        int M = nums[0].length;
        System.out.println(traverse2dArray(nums,N,M));
    }

    public static List<Integer> traverse2dArray(int[][] nums, int N, int M){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<M;i++){
            for(int j=N-1;j>=0;j--){
                ans.add(nums[j][i]);
            }
        }
        return ans;
    }
}

/*
Sample Input :
3 3
4 7 1
8 9 9
6 4 9

Sample Output:
1 7 4 8 9 9 9 4 6
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{4,7,1},{8,9,9},{6,4,9}};
        int N = matrix.length;
        int M = matrix[0].length;
        String result = "";
        List<Integer> ans = zigzag(matrix,N,M);
        for(int item: ans){
            result = result + item + " ";
        }
        System.out.println(result);
    }
    public static List<Integer> zigzag(int[][]matrix, int N,int M){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            if(i%2==0){
                for(int j=M-1;j>=0;j--){
                    ans.add(matrix[i][j]);
                }
            }else{
                for (int j=0;j<M;j++){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}

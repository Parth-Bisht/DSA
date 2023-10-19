/*
In this problem, we are given a square matrix, and we have to traverse the matrix, such that each the pattern formed
after joining the visited indexes is circular, as shown in the image given in the problem statement

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample Output
7 4 1 2 3 6 9 8
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
    }
    public static void circularTraversal(int[][] matrix, int n){
        List<Integer> output = new ArrayList<>();
        int left=0,right=n-1,top=0,bottom=n-1;
        for(int i=bottom;i>=top;i--){
            output.add(matrix[i][left]);
        }
        left++;
        for(int i=left;i<right;i++){
            
        }
    }
}
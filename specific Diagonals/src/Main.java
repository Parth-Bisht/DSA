import java.util.ArrayList;

/*
Given a matrix of size row*col which contains distinct integers and you are given an integer and you need to print
both the diagonals crossing through the given element , you can always assume that the given element always exist in the matrix.

Row = 3, Col = 3
1 2 3
4 5 6
7 8 9

K = 6

Diagonal 1: 2 6 (Left to right diagonal and from top to bottom order)
Diagonal 2: 6 8 (Right to left diagonal and from top to bottom order)
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = 3,m=3,k=6;
        specificDiagonal(matrix,k,n,m);
    }
    public static void specificDiagonal(int[][] matrix,int K,int n,int m){
        int a = 0;
        int b = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==K){
                    a = i;
                    b = j;
                }
            }
        }
        ArrayList<Integer> leftDiag = new ArrayList<>();
        ArrayList<Integer> rightDiag = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==K){
                    leftDiag.add(matrix[i][j]);
                    rightDiag.add(matrix[i][j]);
                } else if(i-j==a-b) {
                    leftDiag.add(matrix[i][j]);
                } else if(i+j==a+b){
                    rightDiag.add(matrix[i][j]);
                }
            }
        }
        System.out.println(leftDiag);
        System.out.println(rightDiag);
    }
}
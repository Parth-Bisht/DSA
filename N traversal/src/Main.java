/*
In this problem, we are given a square matrix, and we have to traverse the matrix such that the pattern formed after
joining the visited indexes resembles anN. If we observe carefully, we have to visit all the elements in the first column,
in reverse fashion, then the elements along the diagonal such that the index of row is equal to the index of column, and
then finally, we have to traverse the last column, from bottom to top. Care should be taken about the top left corner element,
and the bottom right corner element, that they are not visited twice.

Sample Input:
3
1 2 3
4 5 6
7 8 9

Sample Output:
7 4 1 5 9 6 3
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix[0].length;
        nTraversal(matrix,n);
    }
    public static void nTraversal(int[][] matrix,int n){
        StringBuilder bag = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            bag.append(matrix[i][0]).append(" ");
        }
        for(int i=1;i<n;i++){
            bag.append(matrix[i][i]).append(" ");
        }
        for(int i=n-2;i>=0;i--){
            bag.append(matrix[i][n-1]).append(" ");
        }
        System.out.println(bag);
    }
}
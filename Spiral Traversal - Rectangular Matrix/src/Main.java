/*
In this question, we are given a 2D matrix, such that we have to print the spiral traversal of the matrix.
First we have to move along the left-most unvisited column, followed by the bottom-most unvisited column,
followed by the right-most unvisited column, and finally traversing the top-most unvisited row of the matrix.
The important thing here is to modify the boundaries, every time a row or column is visited. This is to be done till
the point, all the elements in the matrix are visited.

Sample Input:
3 4
1 2 3 4
5 6 7 8
9 10 11 12

Sample Output:
1 5 9 10 11 12 8 4 3 2 6 7
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n = 3;
        int m = 4;
        spiralTraversal(matrix,n,m);
    }
    public static void spiralTraversal(int[][] matrix, int n, int m){
        int left = 0, top=0, right = m-1,bottom=n-1,c=0;
        StringBuilder bag = new StringBuilder();
        while(c < (n * m)){
            for(int i=top;i<=bottom;i++){
                bag.append(matrix[i][left]).append(" ");
                c++;
            }
            left++;
            for(int i=left;i<=right;i++){
                bag.append(matrix[bottom][i]).append(" ");
                c++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                bag.append(matrix[i][right]).append(" ");
                c++;
            }
            right--;
            for(int i=right;i>=left;i--){
                bag.append(matrix[top][i]).append(" ");
                c++;
            }
            top++;
        }
        System.out.println(bag);
    }
}
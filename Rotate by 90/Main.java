/*
Given a square matrix of size N , turn it by 90 degrees in an anti-clockwise direction,
as shown in sample input.

Sample input:
4
1 2 3 4
5 6 7 8
1 2 3 4
5 6 7 8

Sample output:
4 8 4 8
3 7 3 7
2 6 2 6
1 5 1 5
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
        int N = 4;
        rotate(matrix,N);
    }
    public static void rotate(int[][] matrix, int N){
        for(int i=N-1;i>=0;i--){
            String bag = "";
            for(int j=0;j<N;j++){
                bag += matrix[j][i]+" ";
            }
            System.out.println(bag);
        }
    }

}

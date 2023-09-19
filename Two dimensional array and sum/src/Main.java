/*
You are given an array of n rows and m columns which contains positive integers and sum s
You need to find occurrences of the sum of three consecutive numbers (i.e x,y, and z ) whose sum is equal to s appear
horizontally, vertically and diagonally in the given matrix.

Sample Input:
n=3, m=3, s=6
3 2 1
2 2 2
1 5 1

Sample Output:
4
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int arrayAndSum(int[][] matrix,int n,int m,int s){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<m-2){
                    int sum = 0;
                    sum += matrix[i][j]+matrix[i][j+1]+matrix[i][j+2];
                    if(sum==s) count++;
                }
                if(i<n-2){
                    int sum = 0;
                    sum += matrix[i][j]+matrix[i+1][j]+matrix[i+2][j];
                    if(sum==s) count++;
                }
                if(i<n-2 && j<m-2){
                    int sum = 0;
                    sum += matrix[i][j]+matrix[i+1][j+1]+matrix[i+2][j+2];
                    if(sum==s) count++;
                }
                if(i>1 && j<m-2){
                    int sum = 0;
                    sum += matrix[i][j]+matrix[i+1][j-1]+matrix[i+2][j-2];
                    if(sum==s) count++;
                }
            }
        }
        return count;
    }
}
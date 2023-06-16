/*
Given an array of integers and a number k, find the maximum sum of a subarray of size k.
Sample Input:
10 3
-1 -1 -2 1 -2 4 1 9 3 9
Sample output:
21
 */
public class Main {
    public static void main(String[] args) {
        int n = 10, k = 3;
        int[] arr = new int[]{-1,-1,-2,1,-2,4,1,9,3,9};
        System.out.println(slidingWindow(n,k,arr));
    }
    public static int slidingWindow(int n,int k,int[] arr){
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int max = sum;
        for(int i=k;i<n;i++){
            sum = sum + arr[i] - arr[i-k];
            max = Math.max(sum,max);
        }
        return max;
    }
}

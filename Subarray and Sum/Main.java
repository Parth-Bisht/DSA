import java.util.Arrays;

/*
Given an array of integers of length n and a positive integer K,
the task is to find the count of the longest possible subarrays with the sum of its elements not divisible by K.

Sample Input:
4 3
2 3 4 6

Sample Output:
1
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        int[] arr = {2,3,4,6};
    }

    public static int subarrayAndSum(int n,int k,int[] arr){
        int s = Arrays.stream(arr).sum();
        if(s%k==0) return 1;
        else{
            for(int i=0;i<n;i++){
                int[] temp = {arr[i]};
                int sum = arr[i];
                for(int j=i+1;j<n;j++){
                     
                }
            }
        }
    }
}

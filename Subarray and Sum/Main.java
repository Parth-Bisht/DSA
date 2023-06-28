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
        int max = 0;
        int count = 0;
        int s = Arrays.stream(arr).sum();
        if(s%k==1) return 1;
        else{
            for(int i=0;i<n;i++){
                int[] temp = new int[n];
                temp[0] = arr[i];
                int sum = arr[i];
                for(int j=i+1;j<n;j++){
                     temp[j] = arr[j];
                     sum += arr[j];
                     if(sum%k==1){
                         max = Math.max(max,temp.length);
                     }
                }
            }
           int temp_sum = 0;
            for(int i=0;i<max;i++){
                temp_sum += arr[i];
            }
            if(temp_sum%k==1) count++;
            for(int i=max;i<n;i++){
                temp_sum = temp_sum+arr[i]-arr[i-max];
                if(temp_sum%k==1) count++;
            }
        }
        return count;
    }
}

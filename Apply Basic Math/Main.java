/*
You are given an array A with N elements. You are allowed to remove only one element, which makes the
sum of all the remaining elements exactly divisible by 7

Your task is to find the first index of smallest element that can be removed from array.
If there is no answer print -1

Sample Input:
5
14 7 8 2 4

Output: 1
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {14,7,8,2,4};
        int N = arr.length;
        System.out.println(math(N,arr));
    }

    public static int math(int N, int[] arr){
        int num = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<N;i++){
            int temp = 0;
            for(int j=0;j<N;j++){
                if(i!=j) temp += arr[j];
            }
            if(temp%7==0 && num>arr[i]){
                num = arr[i];
                index = i;
            }
        }
        return index;
    }
}

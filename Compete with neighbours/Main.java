/*
 You are provided an array A which has N elements.
 Your task is to find the count of such occurrence where the element is larger than its neighbour.

 Sample Input:
 8
 1 2 3 4 2 1 6 5

 Sample Output:
 2
 */
public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1,2,3,4,2,1,6,5};
        int output = compete(n,arr);
        System.out.println(output);
    }
    public static int compete(int n, int[] arr){
        int count = 0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) count++;
        }
        if(arr[0]>arr[1] || arr[n-1]>arr[n-2]) count++;
        return count;
    }
}

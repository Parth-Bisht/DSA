import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public void merge(int[] arr, int left, int right){
        if(left==right) return;
        int mid = (left + (right-left)/2);
        merge( arr, left, mid);
        merge(arr,mid+1,right);
        sort(arr,left,right,mid);
    }

    public static void sort(int[] arr,int left, int right, int mid){
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();

        for(int i=left;i<=mid;i++){
            arr1.add(arr[i]);
        }
        for(int j=mid+1;j<=right;j++){
            arr2.add(arr[j]);
        }

        int current = left;
        int i = 0;
        int j = 0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <=arr2.get(j)){
                arr[current] = arr1.get(i);
                i++;
            }
            else{
                arr[current] = arr2.get(j);
                j++;
            }
            current++;
        }
        while(i<arr1.size()) arr[current++] = arr1.get(i++);
        while(j<arr2.size()) arr[current++] = arr2.get(j++);
    }
}

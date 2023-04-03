public class SelectionSort {
    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] sort(){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]) min_idx=j;
            }
            swap(arr,min_idx,i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

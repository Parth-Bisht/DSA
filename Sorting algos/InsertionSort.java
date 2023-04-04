public class InsertionSort {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] sort(){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

}

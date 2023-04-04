import java.util.Arrays;

/*
    Selection sort
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
//        SelectionSort output = new SelectionSort(arr);
//        int[] sortedArray = output.sort();
//        System.out.println(Arrays.toString(sortedArray));
//        for(int e: sortedArray){
//            System.out.println(e);
//        }

//        BubbleSort output = new BubbleSort(arr);
//        int[] sortedArray = output.sort();
//        System.out.println(Arrays.toString(sortedArray));

//        InsertionSort output = new InsertionSort(arr);
//        int[] sortedArray = output.sort();
//        System.out.println(Arrays.toString(sortedArray));
        MergeSort out = new MergeSort();
        out.merge(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}

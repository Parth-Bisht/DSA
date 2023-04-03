public class BinarySearch {
    private int target;
    private int[] array;
    private int length;

    public BinarySearch(int target, int[] array, int length) {
        this.target = target;
        this.array = array;
        this.length = length;
    }

    public int search(){
        int left = 0 , right = length-1;
        while(left<=right){
            int mid = (left + (right-left)/2);
            if(array[mid]==target) return mid;
            else if(array[mid]>target) right = mid - 1;
            else left = mid+1;
        }
        return -1;
    }
}

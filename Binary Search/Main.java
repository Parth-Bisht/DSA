/*
    Basic implemetation of Binary search.
    Note -
    -> array must be sorted
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {3,4,10,13,18,20};
        int length = 6;
        int target = 3;
        BinarySearch output = new BinarySearch(target,array,length);
        System.out.println(output.search());
    }
}

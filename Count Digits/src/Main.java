import java.util.ArrayList;
import java.util.List;

/*
You are given an array, stored in a variable with the size arr
The size of the array is stored in a variable with the name n
You have to find the count of 0's ,1's and 2's
For example, consider the array as arr = [0 1 0 2 1 2 0 1 2 0], and the value stored in n = 10
Then, the required output will be 4,3,3 , as no. of 0's are 4, no. of 1's are 3, and no. of 2's are 3.

Sample input:
10
0 1 0 1 1 1 0 2 2 0

output:
4 4 2
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,1,1,1,0,2,2,0};
        int n = 10;
        List<Integer> output = countDigits(arr,n);
        StringBuilder strings = new StringBuilder();
        for(int num: output){
            strings.append(num).append(" ");
        }
        System.out.println(strings);
    }

    public static List<Integer> countDigits(int[] arr, int n){
        List<Integer> output = new ArrayList<>();
        output.add(0);
        output.add(0);
        output.add(0);
        for(int num: arr){
            if(num==0){
                output.set(0,output.get(0)+1);
            }else if(num==1){
                output.set(1,output.get(1)+1);
            } else if (num==2) {
                output.set(2,output.get(2)+1);
            }
        }
        return output;
    }
}
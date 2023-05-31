/*
You are given 2 arrays
Your task is to write a program that finds the one integer which is common in both arrays
Note: There is always one integer common in both arrays.

input: [2,5,6] [4,5,9]
output: 5
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,5,6};
        int[] arr2 = {4,1,5};
        System.out.println(intesection(arr1,arr2));
    }
    public static int intesection(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]) return arr1[i];
            }
        }
        return -1;
    }
}

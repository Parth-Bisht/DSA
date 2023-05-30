import java.util.Arrays;

/*
There are n students standing in a line. Each student is assigned a rating value.

You are responsible to distribute the candies to these students subjected to the following requirements:

-> Each student must have at least one candy because every student deserves it.

-> Students with a strictly higher rating get more candies than their neighbors.

What is the minimum number of candies you need to distribute to the student?

input:
3
1 0 2
output: 5
 */
public class Main {
    public static void main(String[] args) {
        int[] students = {1,0,2};
        int n = students.length;
    }

    public static int candies(int[] students, int n){
        int[] candies = new int[n];
        Arrays.fill(candies,1);
        
    }
}

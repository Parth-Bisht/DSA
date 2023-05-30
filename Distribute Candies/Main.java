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
        System.out.println(candies(students,n));
    }

    public static int candies(int[] students, int n){
        int[] candies = new int[n];
        int sum = 0;
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(students[i]>students[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(students[i]>students[i+1] && candies[i]<=candies[i+1]){
                candies[i]=candies[i+1]+1;
            }
        }
        for(int i=0;i<n;i++){
            sum += candies[i];
        }
        return sum;
    }
}

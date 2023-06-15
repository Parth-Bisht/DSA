/*
You are given an array A of N integers
Write a program to find the sum of the
absolute difference between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.

Sample input:
6
1 2 3 5 7 12

Sample output: 45

Hint:
Pairs whose i<j and j-i is prime are :-
1. 1 3 [i=0, j=2] , Difference is 2.
2. 1 5 [i=0, j=3] , Difference is 4.
3. 1 12 [i=0, j=5] , Difference is 11
4. 2 5 [i=1, j=3], Difference is  3.
5. 2 7 [i=1, j=4], Difference is 5.
6. 3 7 [i=2, j=4], Difference is 4.
7. 3 12 [i=2, j=5], Difference is 9
8. 5 12 [i=3, j=5],Difference is 7
Sum of all differences is2+4+11+3+5+4+9+7 = 45.
 */
public class Main {
    public static void main(String[] args) {
        int[] A = new int[] {1,2,3,5,7,12};
        int N = 6;
        System.out.
    }
    public static int specialSum(int[] A, int N){
        int sum = 0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(i<j && isPrime(j-i)){
                    sum += Math.abs(A[i]-A[j]);
                }
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}

/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.
 */

public class Main {
    public static void main(String[] args) {
        
    }
    public static int arrangeCoins(int n){
        int ans = 1;
        while(n>0){
            ans++;
            n -= ans;
        }
        return ans-1;
    }
}

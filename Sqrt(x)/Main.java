/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842...,
and since we round it down to the nearest integer, 2 is returned.
 */

public class Main {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt(x));
    }
    public static int sqrt(int x){
        if(x<=1) return x;
//        return (int) Math.floor(Math.sqrt(x));
        return binarySearch(x);
    }

    public static int binarySearch(int x){
        int left = 1, right = x/2, mid, ans=0;
        long temp;
        while(left<=right){
            mid = (left + (right-left)/2);
            temp = (long)mid * (long)mid;
            if(temp == x) return mid;
            else if(temp<x){
                ans = mid;
                left = mid + 1;
            }
            else right=mid-1;
        }
        return ans;
    }
}

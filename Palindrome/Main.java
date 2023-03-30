/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.
 */

public class Main {
    public static void main(String[] args) {
        int x = 19751;
        System.out.println(palindrome(x));
    }
    public static boolean palindrome(int x){
        if(x<0) return false;
        int temp = x;
        int ans = 0;
        while(temp>0){
            ans = (ans*10)+(temp%10);
            temp = temp/10;
        }
        if(ans==x) return true;
        else return false;
    }
}

/*
You are provided a string S.
Write a program that return the length of the longest palindromic substring.

Sample input: thisracecarisgood
Output: 7
 */
public class Main {
    public static void main(String[] args) {

    }
    public static int checkLongestPalindrome(String s){
        
    }

    public static boolean checkPalindrome(String str, int length){
        String reverse = "";
        for(int i=length-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)) return true;
        return false;
    }
}

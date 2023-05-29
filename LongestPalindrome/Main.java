/*
You are provided a string S.
Write a program that return the length of the longest palindromic substring.

Sample input: thisracecarisgood
Output: 7
 */
public class Main {
    public static void main(String[] args) {
        String s = "thisracecarisgood";
        System.out.println(checkLongestPalindrome(s));
    }
    public static int checkLongestPalindrome(String s){
        int max = 0;
        for(int i=0;i<s.length();i++){
            String temp = "";
            for(int j=i;j<s.length();j++){
                temp += s.charAt(j);
                if(checkPalindrome(temp,temp.length())){
                    max = Math.max(temp.length(),max);
                }
            }
        }
        return max;
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

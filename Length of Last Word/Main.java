/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.

 Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
 */

public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        
//        String temp = s.trim();
//        int count = 0;
//        for(int i=temp.length();i>=0 && temp.charAt(i)!=' ';i--){
//            count++;
//        }
//        return count;
    }
}

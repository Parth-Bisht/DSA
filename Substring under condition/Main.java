/*
You are given a string s, you have to find the count of all such substrings which start and ends with the same character.

Input: abcab
Output: 7

Substrings of abcab are - a,abca,b,bcab,c,a,b
 */

public class Main {
    public static void main(String[] args) {
        String s = "zebyotzpuorypvetkvpip";
        System.out.println(substring(s));
    }
    public static int substring(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)==c) count++;
            }
        }
        return count;
    }
}

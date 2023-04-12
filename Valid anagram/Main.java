/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
 */

public class Main {
    public static void main(String[] args) {
        String s = "anargam";
        String t = "nagaram";
        System.out.println(isAnargam(s,t));
    }

    public static boolean isAnargam(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
}

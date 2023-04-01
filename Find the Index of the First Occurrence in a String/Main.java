/*
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

public class Main {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int out = firstOccurance(haystack,needle);
        System.out.println(out);
    }
    public static int firstOccurance(String haystack,String needle){
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l1<l2) return -1;
        else if (needle.length()==0) {
            return -1;
        }
        int temp = l1-l2;
        for(int i=0;i<=temp;i++){
            if(haystack.substring(i,i+l2).equals(needle)) return i;
        }
        return -1;
    }
}
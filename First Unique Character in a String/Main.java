/*
Given a string s,
find the first non-repeating character in it and return its index. If it does not exist, return -1.

Input: s = "leetcode"
Output: 0

Input: s = "loveleetcode"
Output: 2

Input: s = "aabb"
Output: -1
 */
public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(unique(s));
    }
    public static int unique(String s){
        int len = s.length();
        if(len==0) return -1;
        int[] arr = new int[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0;i<len;i++){
            if(arr[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}

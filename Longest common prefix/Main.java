/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class Main {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String output = longestCommonPrefix(str);
        System.out.println(output);
    }

    public static String longestCommonPrefix(String str[]){
        int l = 0;
        for(int i=0;i<str[0].length();i++){
            boolean flag = true;
            for(int j=0;j<str.length;j++){
                if(l>=str[j].length() || str[j].charAt(l)!=str[0].charAt(l)){
                    flag = false;
                    break;
                }
            }
            if(flag) l++;
            else break;
        }
        return str[0].substring(0,l);
    }
}

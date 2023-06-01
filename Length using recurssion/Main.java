/*
Given a string, S. Find the length of the string using recursion.
Note: You are not allowed to use the length built-in property.

Sample input: parthbisht
output: 10
 */
public class Main {
    public static void main(String[] args) {
        String str = "parthbisht";
        System.out.println(findLength(str,0));
    }

    public static int findLength(String str, int i){
        if(i>str.length()) return 0;
        return 1+findLength(str,i+1);
    }
}

/*
Given a string, S. Find the length of the string using recursion.
Note: You are not allowed to use the length built-in property.

Sample input: parthbisht
output: 10
 */
public class Main {
    public static void main(String[] args) {

    }

    public static int findLength(String str, int i){
        if(str.charAt(i)=='\0') return 0;
        return 1+findLength(str,i+1);
    }
}

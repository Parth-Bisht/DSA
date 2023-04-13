/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it

Input: num = 0
Output: 0
 */

public class Main {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num){
        while(num>=10){
            int rem = num%10;
            int que = num/10;
            num = rem+que;
        }
        return num;
    }
}

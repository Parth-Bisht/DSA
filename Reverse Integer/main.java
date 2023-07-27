/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Input: x = 123
Output: 321

Input: x = -123
Output: -321

 */
public class main {
    public static void main(String[] args) {
        int x= -123;
        System.out.println(reverseTheNumber(x));
    }
    public static int reverseTheNumber(int x){
        long reverse = 0;
        while(x!=0){
            int rem = x%10;
            reverse = reverse*10+rem;
            x = x/10;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) return 0;
        return (int) reverse;
    }
}

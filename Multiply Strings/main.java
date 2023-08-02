import java.math.BigInteger;

/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example:
Input: num1 = "2", num2 = "3"
Output: "6"

Example:
Input: num1 = "123", num2 = "456"
Output: "56088"
 */
public class main {
    public static void main(String[] args) {
        String num1 = "123456789432632454325";
        String num2 = "9876543219435943435432";
        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return String.valueOf(c);
    }
}

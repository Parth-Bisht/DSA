/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Input: n = 3
Output: ["1","2","Fizz"]

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
    public static List fizzBuzz(int n){
        List<String> ans = new ArrayList<String>(n+1);
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0) ans.add("FizzBuzz");
            else if(i%3==0) ans.add("Fizz");
            else if(i%5==0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
        }
        return ans;
    }
}

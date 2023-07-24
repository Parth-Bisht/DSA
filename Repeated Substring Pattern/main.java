/*
Given a string s, check if it can be constructed by taking
a substring of it and appending multiple copies of the substring together.

Example:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
 */
public class main {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(test(s));
    }
    public static boolean test(String s){
        int n = s.length();
        for(int i=1;i<=n/2;i++){
            if(n%2==0) {
                String curr = s.substring(0, 1);
                int j = i;
                while (j < n && s.substring(j, j + 1).equals(curr)) {
                    j += i;
                }
                if(j==n) return true;
            }
        }
        return false;
    }
}

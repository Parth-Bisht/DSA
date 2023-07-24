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

    }
    public static boolean test(String s){
        int n = s.length();
        for(int i=1;i<=n;i++){
            String curr = s.substring(0,1);
            int j=i;
            while(j<n && s.substring(j,j+1).equals(curr)){
                j += i;
            }
            if(j==n) return true;
        }
        return false;
    }
}

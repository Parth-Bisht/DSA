/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of
your product fails the quality check. Since each version is developed based on the previous version, all the versions
after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following
ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the
first bad version. You should minimize the number of calls to the API.

Example:
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
 */

public class main {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n){
        int s=1,e=n,pos=1;
        while(s<=e){
            
        }
    }

    public static boolean isBadVersion(int version, int input){
        if(version==input) return true;
        return false;
    }

}

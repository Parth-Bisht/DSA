/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Input: x = 3, y = 1
Output: 1
 */
public class Main {
    public static void main(String[] args) {
        int x=1,y=4;
        System.out.println(hammingDistance(x,y));
    }
    public static int hammingDistance(int x,int y){
        int z = x ^ y;
        int setBits = 0;
        while(z>0){
            setBits += z&1;
            z >>= 1;
        }
        return setBits;
    }
}

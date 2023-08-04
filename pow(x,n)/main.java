/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example:
Input: x = 2.10000, n = 3
Output: 9.26100
 */
public class main {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(pow(x,(long) n));
    }
    private static double pow(double x, long n){
        if(n==0) return 1;
        if(n<0) return 1.0/pow(x,-n);
        if(n%2==1) return x*pow(x*x,(n-1)/2);
        else return pow(x*x,n/2);
    }
}

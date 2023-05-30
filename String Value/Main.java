/*
In this problem, we have to find the sum of all the values associated with individual characters
in the string, such that the value associated with ais 0,bis 1,cis 2, and so on.
 */
public class Main {
    public static void main(String[] args) {

    }
    public static int stringValue(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int temp = (int) s.charAt(i);
            sum += temp;
        }
        return sum;
    }
}

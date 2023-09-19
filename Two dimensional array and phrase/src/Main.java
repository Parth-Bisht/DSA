/*
You are given an array of n rows and m columns which contains lower case English letters. How many times does the
phrase "saba" appear horizontally, vertically, and diagonally in the grid?

Sample Input:
n=5, m=5
s a f e r
a m j a d
b a b o l
a a r o n
s o n g s

Sample output:
2
 */
public class Main {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'s','a','f','e','r'},{'a','m','j','a','d'},{'b','a','b','o','l'},{'a','a','r','o','n'},{'s','o','n','g','s'}};
        int n=5,m=5;
    }
    public static int arrayAndPhrase(char[][] matrix,int n,int m){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<m-3){
                    String bag = "";
                    bag = bag + matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i][j+3];
                    if(bag.equals("saba")) count++;
                }
                if(i<n-3){
                    String bag = "";
                    bag = bag + matrix[i][j]+matrix[i+1][j]+matrix[i+2][j]+matrix[i+3][j];
                    if(bag.equals("saba")) count++;
                }
                if(i<n-3 && j<m-3){
                    String bag = "";
                    bag = bag + matrix[i][j]+matrix[i+1][j+1]+matrix[i+2][j+2]+matrix[i+3][j+3];
                    if(bag.equals("saba")) count++;
                }
                if(i>2 && j<m-3){
                    String bag = "";
                    bag = bag + matrix[i][j]+matrix[i-1][j+1]+matrix[i-2][j+2]+matrix[i-3][j+3];
                    if(bag.equals("saba")) count++;
                }
            }
        }
        return count;
    }
}
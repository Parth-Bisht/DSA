public class Main {
    public static void main(String[] args) {
        String s = "Radar";
        System.out.println(checkPalindrome(s));
    }
    public static boolean checkPalindrome(String s){
        String reverseString = "";
        for(int i=s.length()-1;i>=0;i--){
            reverseString += s.charAt(i);
        }
        if(reverseString.toLowerCase().equals(s.toLowerCase())) return true;
        return false;
    }
}

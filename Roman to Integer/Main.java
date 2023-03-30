/*
Input: s = "III"
Output: 3
Explanation: III = 3.

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
 */
 class Main {
    public static void main(String[] args) {
        String s = "LDIII";
        RomanToInteger ans = new RomanToInteger();
        System.out.println(ans.convertToInteger(s));
    }


}

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true
 */
public class Main {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t){
        HashMap <Character,Character> replacement = new HashMap<>();
        HashMap <Character, Boolean> used = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if (replacement.containsKey((s.charAt(i)))) {
                if (replacement.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (used.containsKey(t.charAt(i))) return false;
                replacement.put(s.charAt(i), t.charAt(i));
                used.put(t.charAt(i), true);
            }
        }
        return true;
    }
}

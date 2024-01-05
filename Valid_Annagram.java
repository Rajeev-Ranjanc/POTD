//https://leetcode.com/problems/valid-anagram/
import java.util.Arrays;
public class Valid_Annagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println (isAnagram ( s , t ));
    }
    public static boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
        s = Arrays.toString ( first );
        t = Arrays.toString ( second );
        return s.equals ( t );

    }
}

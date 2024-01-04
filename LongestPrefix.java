//https://leetcode.com/problems/longest-common-prefix/
import java.util.Arrays;
public class LongestPrefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        //string as ans

        //sort the array so the array of string will sort accroind to their alphabet
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();


        //and finally compare first and last array elements

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            else{
                ans.append ( first[i] );
            }
        }
        return new String(ans);
    }
}

//https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;
public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println (longestCommonPrefix ( strs ));

//        Arrays.sort ( strs );
//        System.out.println (Arrays.toString ( strs ));
    }
    public static String longestCommonPrefix(String[] str) {
        //firts sort the string of array,
        //so it will sort according to alphabet
        Arrays.sort (str); //Sorted

        //create array of smallest array elemnets which is gonna substring(ans),
        //which will be comman in every string
        StringBuilder ans = new StringBuilder ();
        char[] first = str[0].toCharArray ();

        char[] last = str[str.length-1].toCharArray ();

        for(int i=0;i<first.length;i++){

            if(first[i]!=last[i]){

                break;

            }

            else {

                ans.append ( first[i] );
            }

        }

        return new String (ans);
    }
}

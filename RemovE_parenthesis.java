//https://leetcode.com/problems/remove-outermost-parentheses/
//7th day of POTD
import java.util.Stack;
public class RemovE_parenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println (removeOuterParentheses ( s ));
    }

    public static String removeOuterParentheses(String s) {
    Stack<Character> st = new Stack<> ();
    StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < s.length (); i++) {
            char ch = s.charAt ( i );
            if(ch=='('){
                if(!st.isEmpty ()){
                    sb.append ( ch );
                }
                st.push ( ch );
            }
            else {
                st.pop ();
                if(!st.isEmpty ()){
                    sb.append ( ch );
                }
            }
        }
        return new String (sb);
    }
}

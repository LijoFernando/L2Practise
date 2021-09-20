package Strings;

public class PairParanthesesCheck {
    /*. Valid Parentheses
Easy

9033

356

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'..*/
    public static boolean isValid(String expression, int length ){
        char letter;
        int asci;
       for (int i = 0; i <length-1; i++) {
           if (length/2==1)   return false;
           letter = expression.charAt(i);
           int nxtLetter = expression.charAt(i+1);
            asci = letter;
            if(letter!='(')  asci++;
           if(nxtLetter != (asci+1)) return false;
              //  System.out.println(nxtLetter+" "+(asci+1));
           i++;
      }
       return true;
    }

    public static void main(String[] args) {
        String expression = "{}{}[]";
        int length = expression.length();
        System.out.println("Parantheses Expression is: "+isValid(expression,length)) ;
    }
}

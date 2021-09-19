package Strings;

public class RemoveStringChar {
    /*.Remove character
Basic Accuracy: 61.35% Submissions: 8602 Points: 1
Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).


Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".


Your Task:
You dont need to read input or print anything. Complete the function removeChars() which takes string1 and string2 as input parameter and returns the result string after removing characters from string2  from string1.


Expected Time Complexity:O( |String1| + |String2| )
Expected Auxiliary Space: O(K),Where K = Constant


Constraints:
1 <= |String1| , |String2| <= 50.*/
    public static String getRemovedString(String str1,String str2){
        String removedString ="";
        for (int i = 0; i <str1.length(); i++) {
            char letter = str1.charAt(i);
            int index = str2.indexOf(letter);
            if (index==-1){
                removedString+=""+letter;
            }
        }
        return removedString;
    }

    public static void main(String[] args) {
        String str1 ="occurence";
        String str2 ="car";
        System.out.println(getRemovedString(str1,str2));
    }
}

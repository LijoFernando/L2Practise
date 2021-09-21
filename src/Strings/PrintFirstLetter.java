package Strings;

public class PrintFirstLetter {
    /*.Print first letter of every word in the string
Basic Accuracy: 58.95% Submissions: 20353 Points: 1
Given a string S, the task is to create a string with the first letter of every word in the string.


Example 1:

Input:
S = "geeks for geeks"
Output: gfg

Example 2:

Input:
S = "bad is good"
Output: big

Your Task:
You don't need to read input or print anything. Your task is to complete the function firstAlphabet() which takes string S as input parameter and returns a string that contains the first letter of every word in S.


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 105
S contains lower case English alphabets
Words have a single space between them.*/
    public static void getFirstLetter(String str) {
        //Geek for Geek
        String result ="";
        for (int i = 1; i <str.length(); i++) {
            char letter = str.charAt(i);
            char prev = str.charAt(i-1);
            if(prev ==' ' && letter !=' '){
                result+=letter;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str ="Geek for Geek";
        getFirstLetter(str);
    }
}

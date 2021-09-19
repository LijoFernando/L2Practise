package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PanagramCheck {
    /*.Check if the Sentence Is Pangram
387
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.*/
    public static boolean isparagram(String str){
        Set<Character> alphaList =  new HashSet<>();
        for (char i:str.toCharArray()) {
            alphaList.add(i);
        }
       // System.out.println(Arrays.toString(alphaList.toArray()));
        int zCount = 'z';
        int aCount = 'a';
       // System.out.println(aCount+" "+zCount);
        if(alphaList.size()==(zCount-aCount)+1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isparagram(str));
    }
}

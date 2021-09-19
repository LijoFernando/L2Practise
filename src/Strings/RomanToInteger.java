package Strings;

import java.util.HashMap;

public class RomanToInteger {
    /*.Roman to Integer
Easy

1782

135

Add to List

Share
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 .*/
    public static int getInteger(String romanNo) {
        int sum = 0;
        String romanLetters = "IVXLCDM";
        int[] romanVal = {1, 5, 10, 20, 100, 500, 1000};
        //XXVII
        // check
        for (int i = romanNo.length() - 1; i >= 0; i--) {
            char letter = romanNo.charAt(i);
            int index = romanLetters.indexOf(letter);
            if (index == -1) {
                return 0;
            }
            int value = romanVal[index];
            if (i <= romanNo.length() - 2) {
                char next = romanNo.charAt(i + 1);
                if (letter == 'I' && (next == 'V' | next == 'X')) {
                    sum -= value;
                }
                if (letter == 'X' && (next == 'C' | next == 'L')) {
                    sum -= value;
                }
                if (letter == 'C' && (next == 'M' | next == 'D')) {
                    sum -= value;
                }
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "IV";
        System.out.println(getInteger(str));
    }
}

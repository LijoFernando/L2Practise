package Arrays;

public class RunLengthEncoding {
    /*.Run Length Encoding
Easy Accuracy: 33.12% Submissions: 30205 Points: 2
Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

Example 1:

Input:
str = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times
consecutively b 3 times, c also 3
times.
Example 2:

Input:
str = abbbcdddd
Output: a1b3c1d4
Your Task:
Complete the function encode() which takes a character array as a input parameter and returns the encoded string.

Expected Time Complexity: O(N), N = length of given string.
Expected Auxiliary Space: O(1)

Constraints:
1<=length of str<=100
 .*/
    public static void getEncodedValue(String code) {
        int count=1;
        String result ="";
        StringBuilder strBld = new StringBuilder(code);
        int index =0;
        char first =strBld.charAt(index);
        for (int i = 0; i < strBld.length(); i++) {
            if(i==strBld.length()-1){
                count =i-index;
                result =result+""+first+count;
                break;
            }
            if(first == strBld.charAt(i) && first != strBld.charAt(i+1)){
                count =(i+1)-index;
                result =result+""+first+count;
                index = i+1;
                first =strBld.charAt(i+1);
            }
        }
        System.out.println(result);

        System.out.println(strBld);
    }

    public static void main(String[] args) {
       String code ="eaaaxbbbcccc";
        getEncodedValue(code);
    }
}

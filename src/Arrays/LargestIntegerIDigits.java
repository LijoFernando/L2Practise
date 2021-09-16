package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestIntegerIDigits {
    /*.You are given a large integer represented as an integer array of digits, where
each digits[i] is the ith digit of the integer. The digits are ordered from most
significant to least significant in left-to-right order. The large integer does not
contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [0]
Output: [1]
Explanation: The array represents the integer 0.
Incrementing by one gives 0 + 1 = 1.
Thus, the result should be [1].
Example 4:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0.*/
    public static List<Integer> getlargerdigit(int[] arr, int length){
        List<Integer> digitlist = new ArrayList<>();
        for (int i = 0; i <=length; i++) {
            if(i==length && i==0 && arr[i] == 9) {
                digitlist.add(1);
                digitlist.add(0);
                break;}

            if(i==length-1 && arr[i+1]==9) {arr[i-1]=arr[i-1]+1; arr[i] =0;}
            if(i==length) arr[i]=arr[i]+1 ;
            digitlist.add(arr[i]);
        }
        return digitlist;
    }

    public static void main(String[] args) {
        int[] arr ={5,4,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(getlargerdigit(arr, arr.length-1).toArray()));

    }
}

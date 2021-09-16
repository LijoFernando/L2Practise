package Arrays;

import java.util.*;

public class DistinctDigit {
//    Make a Distinct Digit Array
//    Basic Accuracy: 67.02% Submissions: 1124 Points: 1
//    Given an array nums of positive integers of size N. Find all distinct digits present in nums.
//
//
//            Example 1:
//
//    Input: nums = [131, 11, 48]
//    Output: 1 3 4 8
//    Explanation: 1, 3, 4, and 8 are only distinct
//    digits that can be extracted from the numbers
//    of the array.
//            Example 2:
//
//    Input: nums = [111, 222, 333, 4444, 666]
//    Output: 1 2 3 4 6
//    Explanation: 1, 2, 3, 4, and 6 are only distinct
//    digits that can be extracted from the numbers
//    of the array.
//
//
//    Your Task:
//    You don't need to read or print anything. Your task is to complete the function common_digits() which takes nums as input parameter and returns a list of digits which can be extracted from the given array in ascending order.
//
//
//    Expected Time Complexity: O(N)
//    Expected Space Complexity: O(1)
//
//
//    Constraints:
//            1 <= N <= 105
//            1 <= numsi <= 109
    public static List<Integer> getDistinctDigit(int []arr, int length) {
        List<Integer> digits = new ArrayList<>();
        Set<Integer> filteredDigits =new LinkedHashSet<>();
        for (int i = 0; i <length; i++) {
            while(arr[i]!=0) {
                filteredDigits.add(arr[i] % 10);
                arr[i]=arr[i]/10;
            }
        }

        digits.addAll(filteredDigits);
        return digits;
    }

    public static void main(String[] args) {
        int arr[]  ={111, 222, 333, 4444, 666};
        System.out.println(Arrays.deepToString(getDistinctDigit(arr, arr.length).toArray()));
    }
}

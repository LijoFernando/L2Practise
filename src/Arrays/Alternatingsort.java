package Arrays;

import java.util.*;

public class Alternatingsort {
    //    Alternative Sorting
//    Basic Accuracy: 69.97% Submissions: 2479 Points: 1
//    Given an array arr[] of N distinct integers, output the array in such a way that the first element is first maximum and the second element is the first minimum, and so on.
//
//
//            Example 1:
//
//    Input: N = 7, arr[] = {7, 1, 2, 3, 4,
//            5, 6}
//    Output: 7 1 6 2 5 3 4
//    Explanation:The first element is first
//    maximum and second element is first
//    minimum and so on.
//    Example 2:
//
//    Input: N = 8, arr[] = {1, 6, 9, 4, 3,
//            7, 8, 2}
//    Output: 9 1 8 2 7 3 6 4â€‹
//
//    Your Task:
//    This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function alternateSort() that takes array arr and integer N as parameters and returns the desired array as output.
//
//
//
//    Expected Time Complexity: O(NlogN).
//    Expected Auxiliary Space: O(N).
//
//
//
//    Constraints:
//            1 ≤ N ≤ 106
    public static ArrayList<Long> alternateSort(long arr[], int N) {
        Arrays.sort(arr);
        // {1, 2, 3, 4, 6,7,8, 9}
        // 9 8 7 6 5 4 3 2 1
        ArrayList<Long> sortedList = new ArrayList<>(arr.length);
        int l = 0;
        int r = N - 1;
        while (l < r) {
            sortedList.add(arr[r]);
            sortedList.add(arr[l]);
            l++;
            r--;
        }
        return sortedList;
    }

    public static void main(String[] args) {
        long[] arr = {2, 5, 9, -1, 7, 6, 3};
        System.out.println(Arrays.toString(alternateSort(arr, arr.length).toArray()));
    }

}

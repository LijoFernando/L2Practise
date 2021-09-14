package Arrays;

import java.util.Arrays;

public class WaveArrayt {
//    Wave Array
//    Easy Accuracy: 62.9% Submissions: 65681 Points: 2
//    Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
//    In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
//
//    Example 1:
//
//    Input:
//    n = 5
//    arr[] = {1,2,3,4,5}
//    Output: 2 1 4 3 5
//    Explanation: Array elements after
//    sorting it in wave form are
//2 1 4 3 5.
//    Example 2:
//
//    Input:
//    n = 6
//    arr[] = {2,4,7,8,9,10}
//    Output: 4 2 8 7 10 9
//    Explanation: Array elements after
//    sorting it in wave form are
//4 2 8 7 10 9.
//    Your Task:
//    The task is to complete the function convertToWave() which converts the given array to wave array.
//
//    Expected Time Complexity: O(n).
//    Expected Auxiliary Space: O(1).
//
//    Constraints:
//            1 ≤ n ≤ 106
//            0 ≤ arr[i] ≤107
    public static void convertToWave(int[] arr, int length) {
        for (int i = 0; i <=length; i++) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            if(i == length-2) {
               break;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {2,4,7,8,9,10};
        int length = arr.length-1;
        convertToWave(arr,length);

    }
}

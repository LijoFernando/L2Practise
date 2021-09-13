package Searching;

import java.util.Arrays;

public class FindTripletSumBS {
//    Find triplets with zero sum
//    Basic Accuracy: 48.42% Submissions: 99537 Points: 1
//    Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero.
//
//            Example 1:
//
//    Input: n = 5, arr[] = {0, -1, 2, -3, 1}
//    Output: 1
//    Explanation: 0, -1 and 1 forms a triplet
//    with sum equal to 0.
//    Example 2:
//
//    Input: n = 3, arr[] = {1, 2, 3}
//    Output: 0
//    Explanation: No triplet with zero sum exists.
//
//    Your Task:
//    You don't need to read input or print anything. Your task is to complete the boolean function findTriplets() which takes the array arr[] and the size of the array (n) as inputs and print 1 if the function returns true else print false if the function return false.
//
//    Expected Time Complexity: O(n2)
//    Expected Auxiliary Space: O(1)
//
//    Constrains:
//            1 <= n <= 104
//            -106 <= Ai <= 106

    public static void getTriplets(int arr[]){
       // arr[] = {0, -1, 2, -3, 1}
        Arrays.sort(arr);
        //{-3, -1, 0, 1, 2}
        int target = 0;
        int count = 0;
        int sum = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            count ++;
            sum += arr[i];
            if(count == 3) {
               i=1;
               count=0;
               if(sum == target){
                   System.out.println("contains");
                   break;
               }
            }

        }
    }
}

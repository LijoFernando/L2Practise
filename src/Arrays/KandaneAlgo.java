package Arrays;

import java.util.Arrays;

public class KandaneAlgo {
//    Kadane's Algorithm
//    Medium Accuracy: 51.0% Submissions: 100k+ Points: 4
//    Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
//
//
//    Example 1:
//
//    Input:
//    N = 5
//    Arr[] = {1,2,3,-2,5}
//    Output:
//            9
//    Explanation:
//    Max subarray sum is 9
//    of elements (1, 2, 3, -2, 5) which
//    is a contiguous subarray.
//    Example 2:
//
//    Input:
//    N = 4
//    Arr[] = {-1,-2,-3,-4}
//    Output:
//            -1
//    Explanation:
//    Max subarray sum is -1
//    of element (-1)
//
//    Your Task:
//    You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes Arr[] and N as input parameters and returns the sum of subarray with maximum sum.
//
//
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(1)
//
//
//    Constraints:
//            1 ≤ N ≤ 106
//            -107 ≤ A[i] ≤ 107
    public static long getSumContiguous(int [] arr , int length){
        long result = arr[0];
        long sum = 0;
        for (int i = 0; i <length; i++) {
            sum+=arr[i];
            if(result<sum){
                result = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -2, 5};
        System.out.println(getSumContiguous(arr, arr.length));
    }

}

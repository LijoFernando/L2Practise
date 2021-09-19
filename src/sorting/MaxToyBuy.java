package sorting;

import java.util.Arrays;

public class MaxToyBuy {
    /*.Maximize Toys
Easy Accuracy: 50.24% Submissions: 14431 Points: 2
Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. Your task is to find maximum number of toys you can buy with K amount.

Example 1:

Input:
N = 7
K = 50
arr[] = {1, 12, 5, 111, 200, 1000, 10}
Output: 4
Explaination: The costs of the toys
you can buy are 1, 12, 5 and 10.
Example 2:

Input:
N = 3
K = 100
arr[] = {20, 30, 50}
Output: 3
Explaination: You can buy all toys.
Your Task:
You do not need to read input or print anything. Your task is to complete the function toyCount() which takes the integer N, integer K and the array arr[ ] as input parameters and returns the maximum count of toys you can have.

Expected Time Complexity: O(N * Log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ K, arr[i] ≤ 109.*/
    public static int getMaxToys(int[] arr, int budget,int length) {
        int count=0;
        int sum=0;
        Arrays.sort(arr);
        for (int j = 0; j <length ; j++) {
            if(sum>budget){
                return count-1;
            }
            ++count;
            sum+=arr[j];
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr={20, 30, 50};
        int budget = 100;
        int length = arr.length;
        System.out.println(getMaxToys(arr,budget,length));
    }
}

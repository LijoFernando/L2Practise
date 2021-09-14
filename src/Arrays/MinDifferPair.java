package Arrays;

public class MinDifferPair {
//    Minimum difference pair
//    Basic Accuracy: 71.81% Submissions: 5057 Points: 1
//    Given an unsorted array, find the minimum difference between any pair in given array.
//
//
//            Example 1:
//
//    Input: nums = [2, 4, 5, 9, 7]
//    Output: 1
//    Explanation: Difference between 5 and 4 is 1.
//    Example 2:
//
//    Input: nums = [3, 10, 8, 6]
//    Output: 2
//    Explanation: Difference between 8 and 6 is 2.
//
//
//    Your Task:
//    You don't need to read or print anything. Your task is to complete the function minimum_difference() which takes the array as input parameter and returns the minimum difference  between any pair in given array.
//
//    Expected Time Compelxity: O(N* log(N)) where N is length of array.
//    Expected Space Complexity: O(1)
//
//
//    Constraints:
//            2 <= N <= 105
//            1 <= nums[i] <= 109
    public static void getdifferPair(int arr[], int length) {
        int result = Integer.MAX_VALUE;
        int i=0;
        while(i<length-2){
            int differ = 0;
            if(arr[i]>arr[i+1]){
                differ=arr[i+1]-arr[i];
            }
            if(differ<result){
                result=differ;
            }
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int arr[] ={2, 4, 5, 9, 7};
        getdifferPair(arr,arr.length);
    }
}

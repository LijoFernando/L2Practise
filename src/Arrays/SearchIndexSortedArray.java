package Arrays;

public class SearchIndexSortedArray {
//    Search in a Rotated Array
//    Easy Accuracy: 50.95% Submissions: 18948 Points: 2
//    Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.
//
//    Example 1:
//
//    Input:
//    N = 9
//    A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
//    key = 10
//    Output:
//            5
//    Explanation: 10 is found at index 5.
//    Example 2:
//
//    Input:
//    N = 4
//    A[] = {3, 5, 1, 2}
//    key = 6
//    Output:
//            -1
//    Explanation: There is no element that has value 6.
//    Your Task:
//    Complete the function search() which takes an array arr[] and start, end index of the array and the K as input parameters, and returns the answer.
//
//    Can you solve it in expected time complexity?
//
//    Expected Time Complexity: O(log N).
//    Expected Auxiliary Space: O(1).
//
//    Constraints:
//            1 ≤ N ≤ 107
//            0 ≤ A[i] ≤ 108
//            1 ≤ key ≤ 108
    public static void getIndexBS(int arr[], int length,int target) {
        int begin =0;
        int end =length-1;
       // int count=0;
        while(begin<end){
       //     count++;
            //  A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
            int mid =(end+begin)/2;
            if(arr[mid] == target){
                System.out.println( mid);
                break;
            }
            if(arr[begin]>target && arr[mid]>target){
                begin = mid+1;
            }
            else{
                end = mid-1;
            }
        }
       // System.out.println(count);
    }

    public static void main(String[] args) {
        int  arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        getIndexBS(arr, arr.length, 6);
    }
}

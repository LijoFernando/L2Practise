package Searching;

public class FindMissingBS {
//    Index Of an Extra Element
//    Easy Accuracy: 50.04% Submissions: 55498 Points: 2
//    Given two sorted arrays of distinct elements. There is only 1 difference between the arrays. First array has one element extra added in between. Find the index of the extra element.
//
//            Example 1:
//
//    Input:
//    N = 7
//    A[] = {2,4,6,8,9,10,12}
//    B[] = {2,4,6,8,10,12}
//    Output: 4
//    Explanation: In the second array, 9 is
//    missing and it's index in the first array
//    is 4.
//    Example 2:
//
//    Input:
//    N = 6
//    A[] = {3,5,7,9,11,13}
//    B[] = {3,5,7,11,13}
//    Output: 3
//    Your Task:
//    You don't have to take any input. Just complete the provided function findExtra() that takes array A[], B[] and size of A[] and return the valid index (0 based indexing).
//
//    Expected Time Complexity: O(log N).
//    Expected Auxiliary Space: O(1).
//
//    Constraints:
//            2<=N<=104
//            1<=Ai<=105

    public static void getMissingIndex(int[]arr1, int[]arr2, int n) {
        //    n = 6
        //    arr1[] = {3,5,7,9,11,13}
        //    arr2[] = {3,5,7,11,13}
        int index = n-1;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr1[mid] != arr2[mid]) {
                index = mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int n = 7;
        int arr1[] = {3,5,9,11,12,13};
        int  arr2[] = {3,5,9,12,13};
        getMissingIndex(arr1,arr2,n);

    }
}

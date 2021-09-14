package Arrays;

public class MajortityElement {
//    Majority Element
//    Easy Accuracy: 48.6% Submissions: 100k+ Points: 2
//    Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
//
//
//    Example 1:
//
//    Input:
//    N = 3
//    A[] = {1,2,3}
//    Output:
//            -1
//    Explanation:
//    Since, each element in
//    {1,2,3} appears only once so there
//    is no majority element.
//    Example 2:
//
//    Input:
//    N = 5
//    A[] = {3,1,3,3,2}
//    Output:
//            3
//    Explanation:
//    Since, 3 is present more
//    than N/2 times, so it is
//    the majority element.
//
//    Your Task:
//    The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
//
//
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(1).
//
//
//    Constraints:
//            1 ≤ N ≤ 107
//            0 ≤ Ai ≤ 106
    public static int getMajority(int arr[], int length) {
        int majorty =0;
        int j=0;
        int count = 0;
        for (int i = 1; i < length; i++) {
            count++;
            if(arr[i] == arr[j]){
                majorty++;
            }
            if(majorty>=length-1/2){
                System.out.println(count);
                return arr[i];
            }
            if(i == length-1) {
                j++;
                i=j+1;
            }
        }
        System.out.println(count);
        return  -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,2,3,5,2};
        System.out.println(getMajority(arr,arr.length));
    }
}

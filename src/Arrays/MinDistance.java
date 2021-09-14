package Arrays;

public class MinDistance {
    /*.Minimum distance between two numbers
Basic Accuracy: 38.9% Submissions: 67591 Points: 1
You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
Example 2:

Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return
-1 as x and y don't exist in the array.
Your Task:
Complete the function minDist() which takes the array, n, x and y as input parameters and returns the minimum distance between x and y in the array. If no such distance is possible then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
0 <= A[i], x, y <= 105.*/
    public static void getMinDistance(int[] arr, int x, int y){
       // {86,39,90,67,84,66,62}
        int least = Integer.MAX_VALUE;
        int begin = 0;
        for (int i = 0; i <arr.length-1; i++) {
            if(x == arr[i]) {
                begin = i;
            }
            if(arr[begin] == x && arr[i] == y ) {
                int min =i-begin;
                if(least>min) least = min;
            }
        }
        if(least == Integer.MAX_VALUE)least=-1;
        System.out.println(least);

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,2};
        getMinDistance(arr,4,5);
    }
}

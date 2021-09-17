package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    /*.Remove duplicate elements from sorted Array
Easy Accuracy: 46.78% Submissions: 75551 Points: 2
Given a sorted array A[] of size N, delete all the duplicates elements from A[].
Note: Don't use set or HashMap to solve the problem.


Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates
only one instance of 2 will remain.
Example 2:

Input:
N = 3
Array = {1, 2, 2}
Output: 1 2

Your Task:
You don't need to read input or print anything. Complete the function remove_duplicate() which takes the array A[] and its size N as input parameters and modifies it in place to delete all the duplicates. The function must return an integer X denoting the new modified size of the array.
Note: The generated output will print all the elements of the modified array from index 0 to X-1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 104
1 ≤ A[i] ≤ 106.*/
    public static void removeDuplicate(int arr[] , int length){
        List<Integer> shorted = new ArrayList<>();
        int begin =0;
        int duplicate = arr[begin];
        int end = length-1;
        while(begin<=end){
            int next =arr[++begin];
            if(duplicate != next ){
                shorted.add(duplicate);
                duplicate =next;
            }
            if( begin ==length){
                shorted.add(duplicate);
            }
        }
        System.out.println(Arrays.deepToString(shorted.toArray()));
    }

    public static void main(String[] args) {
        int arr[] ={1,2, 2, 2, 2, 2,3,3,5,5};
        int length = arr.length-1;
        removeDuplicate(arr,length);
    }
}

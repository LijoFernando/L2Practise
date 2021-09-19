package Arrays;

import java.util.*;

public class KthSmallest {
    /*.Kth smallest element
Medium Accuracy: 46.66% Submissions: 100k+ Points: 4
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] =
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given
array is 15.
Your Task:
You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and returns the Kth smallest element.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N.*/
    public static void getKthSmall(int[] arr, int target){
        Map<Integer,Integer> list = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            list.put(arr[i],i);
        }
        int current =Integer.MAX_VALUE;
        int index =0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<current) {
                current =arr[i];
                swap(arr,index,i);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
    public static void targetMin(int target, int[] arr){
        int count=0;
        getKthSmall(arr,target);
        for (int i = 0; i <arr.length; i++) {

        }
    }

    public static void main(String[] args) {
        int[] arr ={ 10,4,3,2,7,15};
        int target =4;
        getKthSmall(arr, target);
    }
}

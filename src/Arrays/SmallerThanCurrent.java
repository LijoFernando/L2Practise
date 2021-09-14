package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallerThanCurrent {
//    1365. How Many Numbers Are Smaller Than the Current Number
//            Easy
//
//2213
//
//        49
//
//    Add to List
//
//            Share
//    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//
//    Return the answer in an array.
//
//
//
//    Example 1:
//
//    Input: nums = [8,1,2,2,3]
//    Output: [4,0,1,1,3]
//    Explanation:
//    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//    For nums[1]=1 does not exist any smaller number than it.
//    For nums[2]=2 there exist one smaller number than it (1).
//    For nums[3]=2 there exist one smaller number than it (1).
//    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
//    Example 2:
//
//    Input: nums = [6,5,4,8]
//    Output: [2,1,0,3]
//    Example 3:
//
//    Input: nums = [7,7,7,7]
//    Output: [0,0,0,0]
//
//
//    Constraints:
//
//            2 <= nums.length <= 500
//            0 <= nums[i] <= 100
    public static void getCount(int[] arr , int length){
     //[6,5,4,8] 4
     // sorted 4,5,6,8.
        int arr2[] = new int[length];
        int j=0;
        int count =0;
        for (int i = 0; i <length ; i++) {
            if(i==length-1 && j==length-1){
                arr2[j] = count;
            }
            if(i == j){
                continue;
            }
            if(arr[j] > arr[i]){
                count++;
            }

            if(i == length-1){
                arr2[j] = count;
                j++;
                i=-1;
                count=0;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int arr[] ={7,7,7,7};
        getCount(arr, arr.length);
    }
}

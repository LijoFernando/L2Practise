package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlideDoor {
//    You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
//
//    Return the max sliding window.
//
//
//
//            Example 1:
//
//    Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//    Output: [3,3,5,5,6,7]
//    Explanation:
//    Window position                Max
//---------------               -----
//        [1  3  -1] -3  5  3  6  7       3
//        1 [3  -1  -3] 5  3  6  7       3
//        1  3 [-1  -3  5] 3  6  7       5
//        1  3  -1 [-3  5  3] 6  7       5
//        1  3  -1  -3 [5  3  6] 7       6
//        1  3  -1  -3  5 [3  6  7]      7
//    Example 2:
//
//    Input: nums = [1], k = 1
//    Output: [1]
//    Example 3:
//
//    Input: nums = [1,-1], k = 1
//    Output: [1,-1]
//    Example 4:
//
//    Input: nums = [9,11], k = 2
//    Output: [11]
//    Example 5:
//
//    Input: nums = [4,-2], k = 2
//    Output: [4]
//
//
//    Constraints:
//
//            1 <= nums.length <= 105
//            -104 <= nums[i] <= 104
//            1 <= k <= nums.length
    public static List<Integer> getMaxOfDoor (int []arr, int length,int j){
        List<Integer> maxList = new ArrayList<>();
        int max =Integer.MIN_VALUE;
        int i = 0;
        int k=0;
       while (i<j && i<=length){
           int value = arr[i];
           if(value>max) max = value;
           if(i==j-1){
               maxList.add(max);
               max =Integer.MIN_VALUE;
               i=k++;
               j++;
           }
           i++;
       }
        return maxList;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,-1,-3,5,3,6};
        System.out.println(Arrays.deepToString(getMaxOfDoor(arr,arr.length-1,3).toArray()));
    }
}

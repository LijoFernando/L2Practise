package Arrays;

public class JumpIndex {
    /*.. Jump Game II
Medium

5708

217

Add to List

Share
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.



Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [0,1,2,3,4]
Output: 2


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 1000.*/
    public static int getNoOfJump(int[] arr, int length) {
        int jump = 1;
        int lIndex = length;
        int sum = 1;
        for (int i = 1; i <= length; i++) {
            jump++;
            sum += arr[i];
            if (sum >=lIndex) {
                return jump;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 4};
        int length = arr.length-1;
        System.out.println(getNoOfJump(arr, length));

    }
}

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SnakeLadder {
    /*.Snake and Ladder Problem
Medium Accuracy: 44.35% Submissions: 9007 Points: 4
Given a 5x6 snakes and ladders board, find the minimum number of dice throws required to reach the destination or last cell (30th cell) from the source (1st cell).

You are given an integer N denoting the total number of snakes and ladders and an array arr[] of 2*N size where 2*i and (2*i + 1)th values denote the starting and ending point respectively of ith snake or ladder. The board looks like the following.

Example 1:

Input:
N = 8
arr[] = {3, 22, 5, 8, 11, 26, 20, 29,
       17, 4, 19, 7, 27, 1, 21, 9}
Output: 3
Explanation:
The given board is the board shown
in the figure. For the above board
output will be 3.
a) For 1st throw get a 2.
b) For 2nd throw get a 6.
c) For 3rd throw get a 2..*/

    static int count(int start) {
        int count = 1;
        if (start > 6) count += (int) Math.ceil(start / 6);
        return count;
    }

    static int travel(int[] arr, int j) {
        int end = 30;
        int count = count(arr[j]);
        int stand = Integer.MIN_VALUE;
        for (int i = j; i < arr.length - 1; i++) {

            if (stand < arr[i]) {
                if (arr[i + 1] > arr[i]) {
                    count++;
                    stand = arr[i + 1];
                    // System.out.print(stand+" travel() ");
                }
            }
            i++;
        }
        count += (int) Math.ceil((end - stand) / 6);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 22, 5, 8, 11, 26, 20, 29, 17, 4, 19, 7, 27, 1, 21, 9};
        int least = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) break;
            int temp = travel(arr, i);
            //  System.out.print(temp+" temp");
            //System.out.println();
            if (temp < least) least = temp;
            i++;
        }
        System.out.println(least);
    }

}

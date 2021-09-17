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
    public static void getThrowCount(int[] ladders) {
        //Map<Integer, Integer> ladderMap = new HashMap<>();
        int count = 0;
        int begin = 0;
        int stand = begin + 1;
        int end = ladders.length - 1;
        int i = 0;
        i = stand+1;
        while (begin < end) {
            int mouth = ladders[i];
            int tail = ladders[i + 1];
            if (mouth>ladders[stand]) {
                if (tail>mouth) {
                    stand=i+1;
                    count++;
                }
            }
            i = i + 2;
            if (tail<mouth) {
                i = 0;
               count = (ladders.length - 1) - stand + count;
                System.out.println(count);
                count = 0;
                begin=begin + 2;
                stand=stand+1;
            }
        }
//        for (int i = 0; i < ladders.length-1 ; i++) {
//            ladderMap.put(ladders[i], ladders[i+1]);
//            i++;
//        }
//        System.out.println(ladderMap.entrySet());
//        for (int k:ladderMap.keySet()){
//
//        }

    }

    public static void main(String[] args) {
        int[] ladder = {3, 22,
                5, 8,
                11, 26,
                20, 29,
                17, 4,
                19, 7,
                27, 1,
                21, 9};
        getThrowCount(ladder);
    }
}

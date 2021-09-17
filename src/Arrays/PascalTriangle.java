package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    /*.. Pascal's Triangle II
1747
236
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:
Input: rowIndex = 0
Output: [1]
Example 3:
Input: rowIndex = 1
Output: [1,1]

Constraints:
0 <= rowIndex <= 33.*/
    public static void getTriangleAtIndex(int n){
        List<Integer> triangle = new ArrayList<>();
        n++;
        long value= 1;
        for (int i = 1; i <=n; i++) {
            triangle.add((int)value);
            value = value*(n-i)/i;
        }
        System.out.println(Arrays.deepToString(triangle.toArray()));
    }
    public static void main(String[] args) {
        int n = 5;
        getTriangleAtIndex(n);
    }
}

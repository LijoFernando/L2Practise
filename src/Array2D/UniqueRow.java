package Array2D;

import java.util.*;

public class UniqueRow {
//    Unique rows in boolean matrix
//    Easy Accuracy: 49.41% Submissions: 11833 Points: 2
//    Given a binary matrix your task is to find all unique rows of the given matrix.
//
//    Example 1:
//
//    Input:
//    row = 3, col = 4
//    M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
//    Output: 1 1 0 1 $1 0 0 1 $
//    Explanation: Above the matrix of size 3x4
//    looks like
//1 1 0 1
//        1 0 0 1
//        1 1 0 1
//    The two unique rows are 1 1 0 1 and
//1 0 0 1 .
//    Your Task:
//    You only need to implement the given function uniqueRow(). The function takes three arguments the first argument is a matrix M and the next two arguments are row and col denoting the rows and columns of the matrix. The function should return the list of the unique row of the martrix. Do not read input, instead use the arguments given in the function.
//
//            Note: The drivers code print the rows "$" separated.
//
//    Expected Time Complexity: O(row * col)
//    Expected Auxiliary Space: O(row * col)
//
//    Constraints:
//            1<=row,col<=40
//            0<=M[][]<=1
    public static List<String> getUiqueRow(int [][] matrix , int n, int m){
        List<String> uniqueRows = new ArrayList<>();
        int j=0;
        String decimal ="";

        Map<Integer,String> uniqueMap = new HashMap<>();
        int [] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=0;
            arr[i]=matrix[j][i];
            decimal =decimal+""+arr[i];
            if(i==n-1) {
                uniqueMap.put(Integer.parseInt(decimal),Arrays.toString(arr));
                decimal="";
                    i = -1;
                    j++;
            }
            if(j==m) break;
        }
     //   System.out.println(uniqueMap.entrySet());
        for (String i: uniqueMap.values()) uniqueRows.add(i);
        return uniqueRows;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 1},{1, 0, 0, 1},{1, 1, 0, 1}};
        System.out.println(Arrays.deepToString(getUiqueRow(matrix,matrix[0].length,matrix.length).toArray()));
    }
}

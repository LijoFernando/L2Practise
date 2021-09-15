package Array2D;

import java.util.ArrayList;
import java.util.List;

public class ContainsMakeZero {
/*. Set Matrix Zeroes
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.
Example 1:

Input: matrix = [[1,1,1],
                 [1,0,1],
                 [1,1,1]]
Output: [[1,0,1],
         [0,0,0],
         [1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1.*/
    public static int [][] findZero(int[][] matrix, int n , int m ){
        List<Integer> x=new ArrayList<>();
        List<Integer> y=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(matrix[i][j]==0){
                   x.add(i);
                   y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j <m; j++) {
                matrix[x.get(i)][j]=0;
            }
            for (int j = 0; j <n; j++) {
                matrix[j][y.get(i)]=0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        //{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] matrix ={{1,1,1},{1,0,1},{1,1,1}};
        int m=matrix.length;
        int n=matrix[0].length;
        int [][] newMatrix =findZero(matrix,m,n);
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

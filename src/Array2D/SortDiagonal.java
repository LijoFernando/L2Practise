package Array2D;

import java.util.Arrays;

public class SortDiagonal {
//    Write a Program to Sort 2D Array Across Left Diagonal
//    Sample Input: Matrix without sorting
//        {{5 ,2, 0, 7, 1},{ 3, 4, 2, 9, 14},{5, 1, 3, 5, 2},{4, 2, 6, 2, 1},{0, 6, 3, 5, 1}}
//    Sample Output: Matrix after sorting
//        1 2 0 7 1
//        3 2 2 9 14
//        5 1 3 5 2
//        4 2 6 4 1
//        0 6 3 5 5

    public  static  void getDiagonal(int[][] matrix, int n){
        int begin = 0;
        int[] diagonalValue = new int[n];
        while(begin < n){
            diagonalValue[begin]=matrix[begin][begin];
            ++begin;
        }
        begin=0;
       // for(int i:diagonalValue) System.out.print(i);
        Arrays.sort(diagonalValue);
        while(begin < n){
            matrix[begin][begin]=diagonalValue[begin];
            ++begin;
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int [][]matrix ={{5 ,2, 0, 7, 1},{ 3, 4, 2, 9, 14},{5, 1, 3, 5, 2},{4, 2, 6, 2, 1},{0, 6, 3, 5, 1}};
        getDiagonal(matrix,matrix.length);
    }

}
